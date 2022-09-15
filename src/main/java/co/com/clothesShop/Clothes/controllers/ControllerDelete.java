package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ControllerDelete {

    @Autowired
    private Shop shop;

    @PostMapping("/delete")
    public Map<String, Object> delete(@RequestBody int id){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        resultMap.put("Products", shop.deleteProduct(id));
        return resultMap;
    }
}
