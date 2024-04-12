package com.chris_YPC.ecommerce.dao;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import com.chris_YPC.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;



@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    // http://localhost:8080/api/states/search/findByCountryCode?code=US
    List<State> findByCountryCode(@Param("code") String code);

}