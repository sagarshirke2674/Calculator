import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTesting {
    Calculator calculator=new Calculator();
    private static final double DELTA=1e-12;
    @Test
    public void sqrtTest()
    {
        assertEquals("Test case 1 for square root functionality",8,calculator.getSqrt(64),DELTA);
        assertEquals("Test case 2 for square root functionality",12,calculator.getSqrt(144),DELTA);
    }
    @Test
    public void factorialTest()
    {
        assertEquals("Test case 1 for factorial functionality",120,calculator.getFact(5),DELTA);
        assertEquals("Test case 2 for factorial functionality",40320,calculator.getFact(8),DELTA);
    }
    @Test
    public void logeTest()
    {
        assertEquals("Test case 1 for natural logarithm functionality",2.3025,calculator.getLoge(10),DELTA);
        assertEquals("Test case 2 for natural logarithm functionality",3.2188,calculator.getLoge(25),DELTA);
    }
    @Test
    public void powerTest()
    {
        assertEquals("Test case 1 for power functionality",289,calculator.getPow(7,2),DELTA);
        assertEquals("Test case 2 for power functionality",262144,calculator.getPow(8,6),DELTA);
    }
}