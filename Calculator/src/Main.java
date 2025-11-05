import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자 입력: ");
        int num2 = sc.nextInt();

        Calculator calc_add = new Calculator();

        calc_add.setNumbers(num1, num2);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();

        calc_sub.setNumbers(num1, num2);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(num1, num2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        AdvancedCalculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(num1, num2);
        calc_div.divide();
        calc_div.displayResult("/");

        ScientificCalculator calc_mod = new ScientificCalculator();
        calc_mod.setNumbers(num1, num2);
        calc_mod.mod();
        calc_mod.displayResult("%");

    }
}