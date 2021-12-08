package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Product;
import com.example.model.ProductEmployee;

public interface EmployeeProductRepository extends CrudRepository<ProductEmployee, Long>{
	
	@Query("select ep.p from ProductEmployee ep where ep.e.id=?1")
	public List<Product> findProductsByEmployeeId(Long eId);
	
	@Transactional
	@Modifying
	@Query("delete from ProductEmployee ep where ep.e.id=?1 and ep.p.id=?2")
	public void removeProductForEmployee(Long eId,Long pId);
}
