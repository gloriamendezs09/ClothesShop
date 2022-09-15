package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//Tiene el mismo efecto que la anotación Bean
@RestController
public class ControllerDelete {

    @Autowired
    private Shop shop;

    //Se utiliza para indicar al proyecto cual va a ser la ruta utilizada por el navegador
    //para acceder al método
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
