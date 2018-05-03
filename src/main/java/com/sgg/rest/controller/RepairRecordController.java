package com.sgg.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgg.rest.service.RepairRecordService;

@RestController
@RequestMapping("/repairRecord")
public class RepairRecordController {
	@Autowired  
	RepairRecordService repairRecordService;
}
