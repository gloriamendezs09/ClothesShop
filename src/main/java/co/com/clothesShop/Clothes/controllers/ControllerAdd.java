package co.com.clothesShop.Clothes.controllers;

import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdd {

    //Con esta anotación se inicializa una instancia al objeto creado
    //mediante la anotación Bean y que está almacenada en el contenedor de Spring
    @Autowired
    private Shop shop;

    @GetMapping("/add")
    public String add(){
        int a = 10;
        int b = 2;

        return ("La suma de los numeros " + a + " + " + b + " es: " + calculator.add(a, b));
    }
}
