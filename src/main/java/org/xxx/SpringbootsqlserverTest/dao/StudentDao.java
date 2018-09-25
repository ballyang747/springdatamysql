package org.xxx.SpringbootsqlserverTest.dao;

import org.springframework.data.repository.CrudRepository;
import org.xxx.SpringbootsqlserverTest.bean.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {
	

}
