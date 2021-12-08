package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	@Query("select e.name from Employee e where e.name like %?1%")
	public List<String> findEmployeeLikeName(String name);

	@Transactional
	@Modifying
	@Query("delete from Employee e where e.id=?1")
	public void removeEmployee(Long eId);
	
	
}
