package com.kodilla.abstracts.homework;

public class Aplication {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.format("Po ow. koła o promieniu %.2f wynosi %.2f\n" ,  circle.getRadius(), circle.area());
        System.out.format("Obwód koła o promieniu %.2f wynosi %.2f\n" ,circle.getRadius() ,circle.perimeter());

        Square square = new Square(10);
        System.out.format("Pole pow. kwadratu o boku %.2f wynosi %.2f\n", square.getSide(), square.area());
        System.out.format("Obwód kwadratu o boku %.2f wynosi %.2f\n", square.getSide(), square.perimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.format("Pole pow. trójkąta o bokac %.2f, %.2f, %.2f wynosi %.2f\n",
               triangle.getSideA(), triangle.getSideB(), triangle.getSideC(), triangle.area());
        System.out.format("Obwód trójkąta o bokac %.2f, %.2f, %.2f wynosi %.2f\n",
                triangle.getSideA(), triangle.getSideB(), triangle.getSideC(), triangle.perimeter());

        Shape circleOne = new Circle(20);
        System.out.format("Powierzchnia koła %.2f\n", circleOne.area());
        System.out.format("Obwód koła: %.2f\n", circleOne.perimeter());
    }
}
