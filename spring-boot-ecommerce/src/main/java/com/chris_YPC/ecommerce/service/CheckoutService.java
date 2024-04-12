package com.chris_YPC.ecommerce.service;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import com.chris_YPC.ecommerce.dto.Purchase;
import com.chris_YPC.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
