package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ControllerAdd {

    //Con esta anotación se inicializa una instancia al objeto creado
    //mediante la anotación Bean y que está almacenada en el contenedor de Spring
    @Autowired
    private Shop shop;

    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Product product){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("Code", 200);
        resultMap.put("Status", "success");
        resultMap.put("Message", "Data found");
        resultMap.put("Products", shop.addProduct(product));
        return resultMap;
    }
}
