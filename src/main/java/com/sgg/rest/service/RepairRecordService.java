package com.sgg.rest.service;

import com.sgg.rest.model.RepairRecord;

public interface RepairRecordService {
	boolean createRepairRecord(Integer repairId,RepairRecord repairRecord);
	boolean deleteRepairRecord(Integer Id);
	boolean updateRepairRecord(Integer repairRecordId,RepairRecord repairRecord);
}
