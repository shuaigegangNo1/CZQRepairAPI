package com.sgg.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Evaluate {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@ManyToOne(targetEntity = ApplicationUser.class)
	@JoinColumn(name="employee_id")
    private ApplicationUser employee;
    private Integer rate;
    private Integer workload;
	@Column(name ="comments",length=1024)
	private String comments;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ApplicationUser getEmployee() {
		return employee;
	}
	public void setEmployee(ApplicationUser employee) {
		this.employee = employee;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getWorkload() {
		return workload;
	}
	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
