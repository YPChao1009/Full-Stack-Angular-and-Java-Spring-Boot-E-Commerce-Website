package com.chris_YPC.ecommerce.dao;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/10
 */

import com.chris_YPC.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

    // http://localhost:8080/api/orders/search/findByCustomerEmail?email=chrischao@test.com
//    Page<Order> findByCustomerEmail(@Param("email") String email, Pageable pageable);
    Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email, Pageable pageable);

}

