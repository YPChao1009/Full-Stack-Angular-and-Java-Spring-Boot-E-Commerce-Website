package com.chris_YPC.ecommerce.entity;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import jakarta.persistence.*;
//import jakarta.persistence.criteria.Order;
import com.chris_YPC.ecommerce.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="quantity")
    private int quantity;

    @Column(name="product_id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
