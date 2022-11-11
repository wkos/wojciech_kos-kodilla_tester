package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    private static final int NUMBER_OF_SHAPES = 20;
    static Random random = new Random();

    public static void main(String[] args) {
        Shape [] shapes = new Shape[random.nextInt(NUMBER_OF_SHAPES) + 1];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = drawShape();
        }
        for (Shape shape: shapes) {
            ShapeUtils.displayShapeInfo(shape);
        }
    }
    private static final int NUMBER_OF_DIFFERENT_SHAPES = 3;

    private static Shape drawShape(){
        int drawnShapeKind = random.nextInt(NUMBER_OF_DIFFERENT_SHAPES);
        double a = getRandomSize(random);
        if(drawnShapeKind == 0)
            return new Circle(a);
        else if(drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;
    }
}
