import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleCalculatorTest {
    CircleCalculator circleCalc;

    @BeforeEach
    void setUp() {
        circleCalc = new CircleCalculator();
        circleCalc.setNumbers(5);
    }

    @Test
    void circleGirthTest() {assertEquals(31.4, circleCalc.circleGirth());}
    @Test
    void circleAreaTest() {assertEquals(78.5, circleCalc.circleArea());}

}