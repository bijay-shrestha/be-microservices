package com.microservice.inventoryservice.controller;

import com.microservice.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private  final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    private boolean isOrderPresent(@PathVariable(name = "sku-code") String skuCode){
        return inventoryService.isOrderPresent(skuCode);
    }
}
