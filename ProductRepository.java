package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	@Query("select p.productName from Product p where p.productName like %?1%")
	List<String> getProductLikeName(String name);

	@Query("select p.productName from Product p where p.price<?2 and p.price>?1")
	List<String> getProductInPriceRange(int low, int high);

	@Transactional
	@Modifying
	@Query("delete from Product p where p.id=?1")
	void removeProduct(Long pId);

}
