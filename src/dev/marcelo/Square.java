package dev.marcelo;

/*
Crie uma classe que modele um quadrado:
Atributos: Tamanho do lado.
Métodos: Mudar valor dos lados, retornar valor dos lados, calcular área e calcular perímetro.
 */

public class Square extends Rectangle {

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calculateArea() {
        return Math.pow(super.getSideA(), 2);
    }

    @Override
    public double calculatePerimiter() {
        return 4 * super.getSideA();
    }
}
