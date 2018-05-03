package com.sgg.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sgg.rest.model.Repair;

public interface RepairRepository extends JpaRepository<Repair, Integer>,JpaSpecificationExecutor<Repair>{

}
