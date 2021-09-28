package co.com.sofka.app.calculator;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    //Primer caso de prueba act
    @Test
    @DisplayName("Testing sum:1+2=3")
public void suma() {
    //Arrange
    long number1 = 1L;
    long number2 = 2L;
    long expectedvalue=3L;

    //Act
    long result = basicCalculator.sum(number1,number2);
    //Assert
    assertEquals(expectedvalue,result);


}
    @Test
    @DisplayName("Testing sum:2-1=2")
    public void resta() {
        //Arrange
        long number1 = 2L;
        long number2 = 1L;
        long expectedvalue=2L;

        //Act
        long result = basicCalculator.subtraction(number1,number2);
        //Assert
        assertEquals(expectedvalue,result);


    }

    @Test
    @DisplayName("Testing sum:1*2=3")
    public void multiplicacion() {
        //Arrange
        long number1 = 1L;
        long number2 = 2L;
        long expectedvalue=2L;

        //Act
        long result = basicCalculator.multiplication(number1,number2);
        //Assert
        assertEquals(expectedvalue,result);


    }

    @Test
    @DisplayName("Testing sum:1/2=3")
    public void divicion() {
        //Arrange
        Float number1 = 2F;
        Float number2 = 2F;
        Float expectedvalue=2F;

        //Act
        Float result = basicCalculator.division(number1,number2);
        //Assert
        assertEquals(expectedvalue,result);


    }







}
