package com.mycode.designpatternsstructuralcomposite.products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Product {
    private final List<Product> products = new ArrayList<>();

    public Box(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    @Override
    public Integer calculatePrice() {
        return products
                .stream()
                .mapToInt(Product::calculatePrice)
                .sum();
    }
}
