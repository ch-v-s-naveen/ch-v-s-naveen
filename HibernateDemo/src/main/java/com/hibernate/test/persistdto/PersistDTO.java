package com.hibernate.test.persistdto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.test.bean.Employee;

public interface PersistDTO extends JpaRepository<Employee, Integer>{

}
