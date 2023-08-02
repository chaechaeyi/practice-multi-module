package com.practice.moduleapi.controller;

import com.practice.moduleapi.service.PerchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PurchaseController {
    private final PerchaseService perchaseService;

    @RequestMapping("/find")
    public void findPurchase(){
        perchaseService.find();
    }
}
