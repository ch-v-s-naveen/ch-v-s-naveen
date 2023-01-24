package com.hibernate.test.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organizaation {

	@Id
	private Integer id;
	private String orgName;
	
	//private Department depts;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
