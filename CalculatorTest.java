package com.company;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private Calculator calculator;
    Double[] array;

    @BeforeEach
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("1 + 1 = 2")
    public void onePlusOneIsTwo(){
        assertEquals(2.0, calculator.plus(1.0,1.0));
    }

    @Test
    @DisplayName("-1 + (-1) = -2")
    @Tag("Addition")
    public void minusOnePlusMinusOneIsMinus2(){
        assertEquals(-2, calculator.plus(-1.0, -1.0));
    }

    @Test
    @DisplayName("1 + 0 = 1")
    @Tag("Addition")
    public void onePlusZeroIsOne(){
        assertEquals(1.0, calculator.plus(1.0, 0.0));
    }

    @Test
    @DisplayName("1 + 11 = false")
    @Tag("Addition")
    public void onePlusElevenIsFalse(){
        assertFalse(calculator.isValidated(1.0 , 11.0));
    }

    @Test
    @DisplayName("1 + 5 = true")
    @Tag("Addition")
    public void onePlusFiveIsTrue(){
        assertTrue(calculator.isValidated(1.0, 5.0));
    }

    @Test
    @DisplayName("Fail")
    public void testFailed(){
        //fail();
    }

    @AfterAll
    public static void setObjectNull(){
        //for example: close DB Connection
    }


    // Exception tests
    @Test
    @DisplayName("throws IllegalArgumentException")
    public void parseStringToDouble(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {Double.parseDouble("OnePointTwo");});
    }

    @Test
    @DisplayName("throws NullPointerException")
    public void calcTotalOfArray(){
        Assertions.assertThrows(NullPointerException.class, () -> {calculator.calcSum(array);});
    }
}
