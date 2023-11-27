package com.mycode.designpatternsstructuralcomposite.products;

public class Book implements Product {
    private Integer price;

    public Book(Integer price) {
        this.price = price;
    }

    @Override
    public Integer calculatePrice() {
        return price;
    }
}
