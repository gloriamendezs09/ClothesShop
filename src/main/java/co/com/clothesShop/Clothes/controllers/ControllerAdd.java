package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerAdd {

    //Con esta anotación se inicializa una instancia al objeto creado
    //mediante la anotación Bean y que está almacenada en el contenedor de Spring
    @Autowired
    private Shop shop;

    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        shop.addProduct(product);
        return product;
    }
}
