package com.sgg.rest.service;

import com.sgg.rest.model.Repair;

public interface RepairService {
	boolean createRepair( Integer userId,Repair repair);
	boolean deleteRepair(Integer Id);
	boolean updateRepair(Integer repairId,Repair repair);
}
