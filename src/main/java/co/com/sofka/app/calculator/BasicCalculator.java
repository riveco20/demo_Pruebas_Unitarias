package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}," + number1 +" y "+ number2);
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2) {
        logger.info("Summing {} + {}," + number1 +" y "+ number2);
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2) {
        logger.info("Summing {} + {}," + number1 +" y "+ number2);

        return number1 * number2;
    }

    public Float division(float number1, float number2) throws ArithmeticException {
        logger.info("Summing {} + {}," + number1 +" y "+ number2);
       if(number2 ==0){
           System.out.println("No se puede dividir por cero");
       }
        return number1/number2;
    }

    public static void main(String[] args) {
        BasicCalculator operacio = new BasicCalculator();
            Float resultado = operacio.division(1,0);
        System.out.println(resultado);
    }
}

