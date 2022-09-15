package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ControllerAdd {

    @Autowired
    private Shop shop;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        resultMap.put("Products", shop.addProduct(product));
        return "Hey there";
    }
}
