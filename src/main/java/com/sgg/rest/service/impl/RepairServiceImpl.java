package com.sgg.rest.service.impl;

import java.util.Date;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.sgg.rest.model.ApplicationUser;
import com.sgg.rest.model.Repair;
import com.sgg.rest.model.RepairQuery;
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
	public boolean createRepair(String userId, Repair repair) {
		ApplicationUser user = userRepository.findByName(userId);
		if (user!=null) {
			repair.setUser(user);
			repair.setCreate_time(new Date());
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
		Repair f_repair = repairRepository.findOne(repairId);
		if (f_repair!= null) {
			f_repair.setAddress(repair.getAddress());
			f_repair.setArea(repair.getArea());
			f_repair.setContent(repair.getContent());
			f_repair.setComments(repair.getComments());
			f_repair.setUpdate_time(new Date());
			repairRepository.save(f_repair);
			return true;
		}
		return false;
	}

	@Override
	public Page<Repair> findRepairNoCriteria(Integer page, Integer size) {
		  Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "id");  
        return repairRepository.findAll(pageable);  
	}

	@Override
	public Page<Repair> findRepairCriteria(Integer page, Integer size, RepairQuery repairQuery) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "id");  
        Page<Repair> repairPage = repairRepository.findAll(new Specification<Repair>(){  
            @Override  
            public Predicate toPredicate(Root<Repair> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {  
//                Predicate p1 = criteriaBuilder.equal(root.get("name").as(String.class), userQuery.getName()); 
            	    Predicate p1 = criteriaBuilder.equal(root.get("user").get("name").as(String.class), repairQuery.getUserName());
                Predicate p2 = criteriaBuilder.like(root.get("content").as(String.class), "%"+ repairQuery.getContent() + "%");  
                query.where(criteriaBuilder.and(p1,p2));  
//                query.where(criteriaBuilder.or(p2));
                return query.getRestriction();  
            }  
        },pageable);  
        return repairPage;  
	}

}
