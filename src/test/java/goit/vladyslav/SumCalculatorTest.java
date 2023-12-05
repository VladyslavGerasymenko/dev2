package goit.vladyslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach(){
        calc = new SumCalculator();
    }

    @Test
    public void testThatNegative(){
        int actual = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(actual));
    }

    @Test
    public void testThat1SumCalculator(){
        int actual = 1;
        int expected = calc.sum(actual);
        Assertions.assertEquals(1, expected);
    }
    @Test
    public void testThat2SumCalculator(){
        int actual = 3;
        int expected = calc.sum(actual);
        Assertions.assertEquals(6, expected);    }

    @Test
    public void testThatMaxInput(){
        int actual = 65537 ;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(actual));
    }
}