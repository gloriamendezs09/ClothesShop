package co.com.clothesShop.Clothes.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public Product addProduct(Product product){
        if (products.size() > 0)
            product.setId(products.get(products.size() - 1).getId() + 1);
        else
            product.setId(1);
        this.products.add(product);
        return product;
    }

    public Product deleteProduct(int id){
        Product p = null;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getId() == id) {
                p = products.get(i);
                products.remove(i);
                break;
            }
        return p;
    }

    public Product modifyProduct(Product product){
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getId() == product.getId())
                products.set(i, product);
        return product;
    }
}
