import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScientificCalculatorTest {
    ScientificCalculator scientificCalc;

    // mod테스트 코드 개발 완료
    // https://github.com/park-woohyun/Java-Calculator-rt/issues/14

    @BeforeEach
    void setUp() {
        scientificCalc = new ScientificCalculator();
        scientificCalc.setNumbers(9,2);
    }

    @Test
    void mod() {
        assertEquals(1, scientificCalc.mod());
    }
}