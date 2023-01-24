package com.hibernate.test.persist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.test.bean.Employee;
import com.hibernate.test.persistdto.PersistDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Service

public class PersistingLoicService {

	@Autowired
	EntityManagerFactory emfe;

	@Autowired
	PersistDTO objPersist;

	public void dave() {
		Employee emp = new Employee();
		if(null !=emfe ||null!=objPersist) {
		EntityManager emf = emfe.createEntityManager();
		SessionFactory sessionObj =  emf.unwrap(SessionFactory.class);
		emp.setDesination("Software Engineer");
		emp.setName("Naveen");
		emp.setMobileNumber((long) 95508733);
		 Session sessObj = sessionObj.openSession();
		sessObj.save(emp);
		objPersist.save(emp);
		}
	}

}
