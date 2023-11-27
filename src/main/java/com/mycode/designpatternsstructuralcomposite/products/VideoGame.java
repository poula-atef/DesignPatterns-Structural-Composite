package com.mycode.designpatternsstructuralcomposite.products;

public class VideoGame implements Product {
    private Integer price;

    public VideoGame(Integer price) {
        this.price = price;
    }

    @Override
    public Integer calculatePrice() {
        return price;
    }
}
