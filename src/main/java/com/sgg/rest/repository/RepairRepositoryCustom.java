package com.sgg.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.sgg.rest.model.AssertRepair;


public interface RepairRepositoryCustom {
	public List<AssertRepair> getAssertRepairList();
	public AssertRepair getAssertRepair(Integer repairId);
	//public List<AssertRepair> getCabinets();
	//public List<AssertRepair> getCabinetsByParentId(Integer parentId);
//    @Query("select *,count(*) as count from message WHERE toid = #{userId} GROUP BY formid ORDER BY created_date desc limit #{offset}, #{limit}")
//    List<AssertRepair> selectAssertRepairList(@Param("userId") String userId, @Param("offset") int offset, @Param("limit") int limit);
}
