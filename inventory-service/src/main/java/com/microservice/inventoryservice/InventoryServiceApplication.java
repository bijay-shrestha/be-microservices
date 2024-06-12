package com.microservice.inventoryservice;

import com.microservice.inventoryservice.model.Inventory;
import com.microservice.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class InventoryServiceApplication implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("1122AA");
        inventory1.setQuantity(3);
        inventory1.setPrice(new BigDecimal(300.00));

        Inventory inventory2 = new Inventory();
        inventory2.setSkuCode("1122BB");
        inventory2.setQuantity(0);
        inventory2.setPrice(new BigDecimal(300.00));

        inventoryRepository.save(inventory1);
        inventoryRepository.save(inventory2);
    }
}
