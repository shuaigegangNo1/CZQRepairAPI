package com.sgg.rest.model;

public class RepairQuery {
	private String info;
    private String content;
    private Integer area;
    private Integer repair_status;
    private String userName;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getRepair_status() {
		return repair_status;
	}
	public void setRepair_status(Integer repair_status) {
		this.repair_status = repair_status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    
}
