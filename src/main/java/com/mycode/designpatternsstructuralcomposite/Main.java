package com.mycode.designpatternsstructuralcomposite;

import com.mycode.designpatternsstructuralcomposite.products.Book;
import com.mycode.designpatternsstructuralcomposite.products.Box;
import com.mycode.designpatternsstructuralcomposite.products.Product;
import com.mycode.designpatternsstructuralcomposite.products.VideoGame;

public class Main {

    public static void main(String[] args) {
        Product videoGame1 = new VideoGame(100);
        Product videoGame2 = new VideoGame(150);

        Product book1 = new Book(25);
        Product book2 = new Book(30);

        Product box1 = new Box(videoGame1);
        Product box2 = new Box(box1, videoGame2);
        Product box3 = new Box(box2);
        Product box4 = new Box(box3, book1, book2);

        System.out.println(box4.calculatePrice());
    }

}
