package com.chris_YPC.ecommerce.dto;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import com.chris_YPC.ecommerce.entity.Address;
import com.chris_YPC.ecommerce.entity.Customer;
import com.chris_YPC.ecommerce.entity.Order;
import com.chris_YPC.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
