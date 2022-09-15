package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerShow {

    @Autowired
    private Shop shop;

    @GetMapping("/show")
    public List<Product> showProducts(){
        return shop.getProducts();
    }

    @GetMapping("/show/{id}")
    public Product showProductById(@PathVariable("id") int id){
        return shop.findProductById(id);
    }
}
