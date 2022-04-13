package dev.marcelo;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(2d, 2d);
        double sideA = square.getSideA();

        System.out.println(sideA);

        double area = square.calculateArea();
        double perimeter = square.calculatePerimiter();

        System.out.println(area + ' ' + perimeter);
    }
}

