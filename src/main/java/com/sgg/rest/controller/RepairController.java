package com.sgg.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgg.rest.model.Repair;
import com.sgg.rest.model.RepairQuery;
import com.sgg.rest.service.RepairService;

@RestController
@RequestMapping("/repair")
public class RepairController {
	@Autowired  
	RepairService repairService;  
	@RequestMapping(value="/create", method= {RequestMethod.POST})
	public ResponseEntity<Map<String,Object>> createRepair(@RequestParam String userId,@RequestBody Repair repair) {
		boolean res =repairService.createRepair(userId, repair);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("result",res);
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
    @RequestMapping(value = "querylist",method = RequestMethod.POST)  
    public  ResponseEntity<Map<String,Object>> getRepairQueryList(@RequestParam Integer page, @RequestBody RepairQuery repairQuery){  
    		Map<String,Object> map = new HashMap<String,Object>();
	    Integer	size =10; //pagesize
        Page<Repair> paginationRepair = repairService.findRepairCriteria(page, size, repairQuery);
        map.put("result", paginationRepair);
        return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);  
    }
}
