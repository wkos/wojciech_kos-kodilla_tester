package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

//        for (int i = 0; i < shapes.size(); i++) {
//            Square square = shapes.get(i);
//            if(shapes.get(i).getArea() > 20.0){
//                System.out.println(square + ", area: " + square.getArea());
//            }
//        }
        for (Square square : shapes) {
            if (square.getArea() > 20) {
                System.out.println(square + ", area: " + square.getArea());
            }
        }
    }
}
