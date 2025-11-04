package es.fpsumma.dam1.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
   
    @Test
    public void sumaOK() {
        int resultado = NumberUtils.suma(2, 3);
        assertEquals(5, resultado);
    }
    @Test
    public void restaOk(){
        int resultado = NumberUtils.subtract(5, 3);
        assertEquals(2, resultado);
        int resultado2 = NumberUtils.subtract(20, 18);
        assertEquals(2, resultado2);
    }
    @Test
    public void multiplicacionOk(){
        int resultado = NumberUtils.multiply(2, 5);
        assertEquals(10, resultado);
        int resultado2 = NumberUtils.multiply(10, 2);
        assertEquals(20, resultado2);
    }
    @Test
    public void divisionOk(){
        int resultado = NumberUtils.division(10, 2);
        assertEquals(5, resultado);
    }
    @Test
    public void parOk(){
        boolean resultado = NumberUtils.isEven(4);
        assertEquals(true, resultado);
        boolean resultado2 = NumberUtils.isEven(11);
        assertEquals(false, resultado2);
    }
    @Test
    public void maximoOk(){
        int resultado = NumberUtils.max(0, 2);
        assertEquals(2, resultado);
    }

}