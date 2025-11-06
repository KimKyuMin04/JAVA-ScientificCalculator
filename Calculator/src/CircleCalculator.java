public class CircleCalculator extends ScientificCalculator {
    double result;

    public void setNumbers(int num1) {
        this.num1 = num1;
    }
    public void displayResult(String operator){
        if (operator.equals("girth")){
            System.out.println("반지름 " + num1 + " 원의 둘레 = " + result);
        }
        else if (operator.equals("area")){
            System.out.println("반지름 " + num1 + " 원의 넓이 = " + result);
        }
        else{
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
    public double circleGirth(){
        result = (2 * num1 * 3.14);
        result = (double) Math.round(result * 10) / 10;
        return result;
    }
    public double circleArea(){
        result = (num1 * num1 * 3.14);
        result = (double) Math.round(result * 10) / 10;
        return result;
    }



}
