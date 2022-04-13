package dev.marcelo.test;

import dev.marcelo.Rectangle;
import dev.marcelo.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square;

    @BeforeEach
    void setup(){
        square = new Square(8d, 8d);
    }



    @Test
    void givenCalculateArea_whenMultiplySides_thenSucceed(){
        //Square square = new Square(8d, 8d);
        double actual = square.calculateArea();
        assertEquals(64d, actual);
    }

    @Test
    void givenCalculatePerimeter_whenSumSides_thenSucceed() {
        //Square square = new Square(8d, 8d);
        square.setSideA(5d);
        square.setSideB(5d);
        double actual = square.calculatePerimiter();
        assertEquals(20d, actual);
    }
}