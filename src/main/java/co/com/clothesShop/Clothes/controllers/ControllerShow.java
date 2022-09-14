package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerShow {

    @Autowired
    private Shop shop;

    //Se utiliza para indicar al proyecto cual va a ser la ruta utilizada por el navegador
    //para acceder al método
    @GetMapping("/show")
    public String showProducts(){
        return
    }
}
