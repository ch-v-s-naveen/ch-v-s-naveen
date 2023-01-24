package com.hibernate.test.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	private Integer id;
	
	private String deptName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	//private Employee employees; 
	

	
}
