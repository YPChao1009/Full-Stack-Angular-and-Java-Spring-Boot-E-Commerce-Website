package com.chris_YPC.ecommerce.entity;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/3/30
 */

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="product_category")
// @Data -- known bug : When make use of relationships like one to many and many to one
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}

