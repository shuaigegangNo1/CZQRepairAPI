package com.sgg.rest.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sgg.rest.model.RepairRecord;
import com.sgg.rest.repository.RepairRecordRepository;
import com.sgg.rest.service.RepairRecordService;
@Service
public class RepairRecordServiceImpl implements RepairRecordService {
	@Resource  
	RepairRecordRepository repairRecordRepository;
	@Override
	public boolean createRepairRecord(Integer repairId, RepairRecord repairRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRepairRecord(Integer Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRepairRecord(Integer repairRecordId, RepairRecord repairRecord) {
		// TODO Auto-generated method stub
		return false;
	}

}
