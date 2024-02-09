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
        Area m = new Area();
        System.out.println("Enter base and height for area of triangle:");
        Scanner sc = new Scanner(System.in);
        float operand_1 = sc.nextFloat();
        float operand_2 = sc.nextFloat();
        double area_triangle = m.Area_of_triangle(operand_1, operand_2);
        System.out.println("Area of Triangle is :" + area_triangle);
        System.out.println("Enter Side for area of circle:");
        float operand_3 = sc.nextFloat();
        double area_rectangle = m.Area_of_square(operand_1);
        System.out.println("Area of Rectangle is :" + area_rectangle);

    }

}
