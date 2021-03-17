import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void verifySquareRoot() { // testing the square root function
        Assert.assertEquals(5, Calculator.squareRoot(25), 0.0);
        Assert.assertEquals(Double.NaN, Calculator.squareRoot(-1), 0.0); // NaN for -ve numbers
        Assert.assertEquals(4.795831523312719, Calculator.squareRoot(23), 0.0);
    }

    @Test
    public void verifyFactorial() { // testing the factorial function
        Assert.assertEquals(1, Calculator.factorial(0), 0.0);
        Assert.assertEquals(120, Calculator.factorial(5), 0.0);
        Assert.assertEquals(Double.NaN, Calculator.factorial(-1), 0.0); // NaN for -ve numbers
    }

    @Test
    public void verifyLogarithm() { // testing the logarithm function
        Assert.assertEquals(1.6094379124341003, Calculator.logarithm(5), 0.0);
        Assert.assertEquals(Double.NaN, Calculator.logarithm(-1), 0.0); // NaN for -ve numbers
        Assert.assertEquals(2.5649493574615367, Calculator.logarithm(13), 0.0);
    }

    @Test
    public void verifyPower() { // testing the power function
        Assert.assertEquals(25, Calculator.power(5, 2), 0.0);
        Assert.assertEquals(-1.0, Calculator.power(-1, -5), 0.0);
        Assert.assertEquals(0.03125, Calculator.power(2, -5), 0.0);
    }
}