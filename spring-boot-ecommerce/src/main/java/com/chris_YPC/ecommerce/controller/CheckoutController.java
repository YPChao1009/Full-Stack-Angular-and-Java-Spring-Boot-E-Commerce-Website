package com.chris_YPC.ecommerce.controller;/*
 * @Author: YUN-PEI CHAO
 * @Date: 2024/4/5
 */

import com.chris_YPC.ecommerce.dto.Purchase;
import com.chris_YPC.ecommerce.dto.PurchaseResponse;
import com.chris_YPC.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}

