// 계산기 v2.0 관련 클래스
// https://github.com/park-woohyun/Java-Calculator-rt/issues/1
public class AdvancedCalculator extends Calculator {

    // 계산기 v2.0 곱하기 개발 완료
    // https://github.com/park-woohyun/Java-Calculator-rt/issues/2
    @Override
    public int multiply() {
        result = num1 * num2;
        return result;
    }

    // 계산기 v2.0 나눗셈 개발 완료
    // https://github.com/park-woohyun/Java-Calculator-rt/issues/3
    @Override
    public int divide() {
        result = num1 / num2;
        return result;
    }
}
