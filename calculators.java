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
        float opr1 = 30;
        float opr2 = 15;
        Math_opr a = new Math_opr();
        double squre = a.squre(opr1);
        System.out.println("Squre of Number  is :" + squre);

        double Min = a.Min(opr1, opr2);
        System.out.println("Minimum Number is :" + Min);
        double Max = a.Max(opr1, opr2);
        System.out.println("Maximum  Number is :" + Max);
        double power = a.power(opr1, opr2);
        System.out.println("Power of Number is :" + power);
        double Absolute = a.Absolute(opr1);
        System.out.println(" Absolute value is " + Absolute);
        double Round = a.Round(opr1);
        System.out.println("Round  to the nearest integer is:" + Round);
    }

}
