package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ControllerShow {

    @Autowired
    private Shop shop;

    @GetMapping("/show")
    public Map<String, Object> showProducts(){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        resultMap.put("Products", shop.getProducts());
        return resultMap;
    }

    @GetMapping("/find/{id}")
    public Map<String, Object> showProductById(@PathVariable("id") int id){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        resultMap.put("Product", shop.findProductById(id));
        return resultMap;
    }
}
