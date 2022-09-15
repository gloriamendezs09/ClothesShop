package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Tiene el mismo efecto que la anotación Bean
@RestController
public class ControllerDelete {

    @Autowired
    private Shop shop;

    //Se utiliza para indicar al proyecto cual va a ser la ruta utilizada por el navegador
    //para acceder al método
    @PostMapping("/delete/{id}")
    public Product delete(@RequestBody int id){
        Product p = new Product("Camisa", 10.0);
        shop.addProduct(p);
        return shop.deleteProduct(id);
    }
}
