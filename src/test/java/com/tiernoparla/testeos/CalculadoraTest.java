
package com.tiernoparla.testeos;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void checkingPackages() {
        
        Calculadora calc = new Calculadora();
        int expected = 5;
        assertTrue("testeo la suma", expected==calc.sumar(2,2) );
        //assertEquals("testeo de suma", expected, calc.sumar(2,2) );
        
        //assertTrue(true);   
    }
    
    
    @Test
    public void dosMasTresSonCinco() {
        
        Calculadora calc = new Calculadora();
        int expected = 5;
        //assertTrue("testeo la suma", expected==calc.sumar(2,2) );
        //assertEquals("testeo de suma", expected, calc.sumar(2,3) );
    }
    
    
    
    
} //CalculadoraTest