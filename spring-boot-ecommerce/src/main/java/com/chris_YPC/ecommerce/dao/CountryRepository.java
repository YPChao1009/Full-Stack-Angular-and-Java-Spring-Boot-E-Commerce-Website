package com.chris_YPC.ecommerce.dao;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import com.chris_YPC.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


// http://localhost:8080/api/countries
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
