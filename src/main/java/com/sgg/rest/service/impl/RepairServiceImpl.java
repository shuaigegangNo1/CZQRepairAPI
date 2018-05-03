package com.sgg.rest.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sgg.rest.model.ApplicationUser;
import com.sgg.rest.model.Repair;
import com.sgg.rest.repository.RepairRepository;
import com.sgg.rest.repository.UserRepository;
import com.sgg.rest.service.RepairService;
@Service
public class RepairServiceImpl implements RepairService {
	@Resource  
    UserRepository userRepository;
	@Resource  
    RepairRepository repairRepository;
	@Override
	public boolean createRepair(Integer userId, Repair repair) {
		ApplicationUser user = userRepository.findOne(userId);
		if (user!=null) {
			repair.setUser(user);
			repairRepository.save(repair);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteRepair(Integer Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRepair(Integer repairId, Repair repair) {
		// TODO Auto-generated method stub
		return false;
	}

}
