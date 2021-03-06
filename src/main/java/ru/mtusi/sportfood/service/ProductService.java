package ru.mtusi.sportfood.service;

import ru.mtusi.sportfood.model.Product;

import java.util.List;

public interface ProductService {

    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
