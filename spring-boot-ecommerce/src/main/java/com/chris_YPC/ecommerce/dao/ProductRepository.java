package com.chris_YPC.ecommerce.dao;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/3/31
 */

import com.chris_YPC.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    // http://localhost:8080/api/products/search/findByCategoryId?id=3
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    // http://localhost:8080/api/products/search/findByNameContaining?name=Python
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);

}




