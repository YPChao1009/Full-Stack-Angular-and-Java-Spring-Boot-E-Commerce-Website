package com.chris_YPC.ecommerce.dao;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */


import com.chris_YPC.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


// http://localhost:8080/api/customers

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
