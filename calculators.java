import java.util.Scanner;

public class calculators {

    void calci()

    {
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {

            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);

    }
}

class arithmatic {
    public static void main(String[] args) {
        calculators z = new calculators();
        z.calci();
        float opr1 = 11;
        float opr2 = 13;
        Arithmaticopr a = new Arithmaticopr();
        double squre = a.squre(opr1);
        System.out.println("Squre of Number  is :" + squre);

        double cube = a.cube(opr1);
        System.out.println("Cube Number is :" + cube);
        double module = a.module(opr1, opr2);
        System.out.println("module of  Number is :" + module);
        double power = a.power(opr1, opr2);
        System.out.println("Power of Number is :" + power);
    }

}
