package com.sgg.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sgg.rest.model.Evaluate;

public interface EvaluateRepository extends JpaRepository<Evaluate, Integer>,JpaSpecificationExecutor<Evaluate>{

}
