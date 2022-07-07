package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Family;
import com.upc.ventas.entidades.Product;
import com.upc.ventas.entidades.Specie;
import com.upc.ventas.repositorios.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductBusiness {
    @Autowired
    ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    public Product updateProduct(Product product){
        Product p = productRepository.findById(product.getCode()).get();
        p = product;
        return productRepository.save(p);
    }
    public Product desactivateProduct(Long code){
        Product p = getProduct_by_code(code);
        p.setActive(false);
        return productRepository.save(p);
    }
    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }
    public Product getProduct_by_code( Long code){
        return productRepository.findById(code).get();
    }
    public Product getProduct_by_name(String name){
        List<Product> products = productRepository.findAll();

        for (Product p: products  ) {
            if (p.getName().equals(name)){
                return productRepository.findById(p.getCode()).get();
            }
        }
        return null;
    }
    public List<Product> getProduct_by_price(Double priceMin, Double priceMax) {
        List<Product> products = productRepository.findAll();
        List<Product> newproducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= priceMin && p.getPrice() <= priceMin) {
                Product pr = productRepository.findById(p.getCode()).get();
                newproducts.add(pr);
            }
        }
        return newproducts;
    }
    public List<Product> getProduct_by_family(String family){
        List<Product> products = productRepository.findAll();
        for (Product p: products){
            if (p.getFamily().getName().equals(family)){
                Product pr = productRepository.findById(p.getCode()).get();
                products.add(pr);
            }
        }
        return products;
    }
    public List<Product> getProduct_by_specie(String specie){
        List<Product> products = productRepository.findAll();
        for (Product p: products){
            if (p.getSpecie().getName().equals(specie)){
                Product pr = productRepository.findById(p.getCode()).get();
                products.add(pr);
            }
        }
        return products;
    }
}
