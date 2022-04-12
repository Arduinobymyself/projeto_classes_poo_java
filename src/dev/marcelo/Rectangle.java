package dev.marcelo;
/*
Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).
Métodos: Mudar valor dos lados, retornar valor dos lados, calcular área e calcular perímetro.
 */

public class Rectangle {
    // atributes
    private double sideA;
    private double sideB;

    // methods
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea(){
        double area = this.sideA * this.sideB;
        return area;
    }

    public double calculatePerimiter(){
        double perimeter = (this.sideA + this.sideB) * 2;
        return perimeter;
    }

    // getter and setter methods
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
