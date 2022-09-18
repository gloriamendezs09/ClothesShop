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
    public Map<String, Object> add(@RequestBody Product product){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        if (product.getId() != 0)
            resultMap.put("Product", shop.modifyProduct(product));
        else
            resultMap.put("Product", shop.addProduct(product));
        return resultMap;
    }
}
