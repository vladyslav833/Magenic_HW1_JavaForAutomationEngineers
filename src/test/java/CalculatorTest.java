import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * The TestNG class for Calculator
 */
public class CalculatorTest {


    @Test
    /**
     * Tests the sum of two integers
     */
    public void testIntAdd() {
        int a = -7;
        int b = 7;
        double sum = Calculator.add(a, b);
        Assert.assertEquals(sum, 0);
    }

    @Test
    /**
     * Tests the sum of two floating point numbers
     */
    public void testDoubleAdd() {
        double a = -3.5;
        double b = - 2.5;
        double sum = Calculator.add(a, b);
        Assert.assertEquals(sum, -6);
    }

    @Test
    /**
     * Tests the subtraction of two integers
     */
    public void testIntSubtract() {
        int a = 10;
        int b = -5;
        double result = Calculator.subtract(a, b);
        Assert.assertEquals(result, 15);
    }

    @Test
    /**
     * Tests the subtraction of two floating point numbers
     */
    public void testDoubleSubtract() {
        double a = 5.5;
        double b = 3.2;
        double result = Calculator.subtract(a, b);
        Assert.assertEquals(result, 2.3);
    }

    @Test
    /**
     * Tests the product of two integers
     */
    public void testIntMultiply() {
        int a = 7;
        int b = -7;
        double product = Calculator.multiply(a, b);
        Assert.assertEquals(product, -49);
    }

//    // TODO: Uncomment this test when all changes to Calculator.java are done
//     @Test
//    /**
//     * Tests the sum of two integers
//     */
//    public void testDoubleMultiply() {
//        double a = 7;
//        double b = -7;
//        double product = Calculator.multiply(a, b);
//        Assert.assertEquals(product, -49);
//    }
}
