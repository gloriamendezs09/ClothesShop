package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Product;
import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Tiene el mismo efecto que la anotación Bean
@RestController
public class ControllerDelete {

    @Autowired
    private Shop shop;

    //Se utiliza para indicar al proyecto cual va a ser la ruta utilizada por el navegador
    //para acceder al método
    @GetMapping("/delete/{id}")
    public Product delete(@PathVariable ("id") int id){
        Product p = new Product("Camisa", 10.0);
        shop.addProduct(p);
        return shop.deleteProduct(id);
    }
}
