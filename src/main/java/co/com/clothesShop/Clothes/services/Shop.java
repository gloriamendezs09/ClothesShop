package co.com.clothesShop.Clothes.services;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product findProductById(int id){
        for (Product p: products)
            if(p.getId() == id)
                return p;
        return null;
    }
}
