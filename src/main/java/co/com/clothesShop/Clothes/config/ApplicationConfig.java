package co.com.clothesShop.Clothes.config;

import co.com.clothesShop.Clothes.services.Shop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    //Los métodos con la anotación Bean se ejecutan siempre al lanzar la aplicación.
    //Así, este método inicializa una instancia de la clase Shop y la deja en el contenedor de Spring
    @Bean
    public Shop configShop(){
        return new Shop();
    }

}
