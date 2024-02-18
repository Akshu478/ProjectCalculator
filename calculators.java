import java.util.Scanner;

public class calculators {

    void calci() {
        double num1 = 10, num2 = 20;

        System.out.println("Num1=" + num1);
        System.out.println("Num2=" + num2);

        System.out.println("Addition=" + (num1 + num2));
        System.out.println("Substraction=" + (num1 - num2));
        System.out.println("Multiplication=" + (num1 * num2));
        System.out.println("Division=" + (num1 / num2));
    }
}

class arithmatic {
    public static void main(String[] args) {
        calculators z = new calculators();
        z.calci();

    }
}
