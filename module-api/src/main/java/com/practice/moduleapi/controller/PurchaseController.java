package com.practice.moduleapi.controller;

import com.practice.moduleapi.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PurchaseController {
    private final PurchaseService purchaseService;

    @RequestMapping("/find")
    public void findPurchase(){
        purchaseService.find();
    }
}
