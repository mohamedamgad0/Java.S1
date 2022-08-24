import java.util.Scanner;
public class S1A3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The first number: ");
        float a = input.nextFloat();

        System.out.println("Enter The operator number ( +, -, *, /): ");
        char s = input.next().charAt(0);

        System.out.println("Enter The second number: ");
        float b = input.nextFloat();

        System.out.println("Enter The answer number: ");
        float r = input.nextFloat();

        switch (s){
            case '+':
                if(a + b == r)
                    System.out.println("The Equation is true");
                else if (a + b != r) {
                    double z = a + b;
                    System.out.println("False the true answer is: " + a + "+" + b + " = " + z );
                }
                break;

            case '-':
                if(a - b == r)
                    System.out.println("The Equation is true");
                else if (a - b != r) {
                    double z = a - b;
                    System.out.println("False the true answer is: " + a + " - " + b + " = " + z );
                }
                break;

            case '*':
                if(a * b == r)
                    System.out.println("The Equation is true");
                else if (a * b != r) {
                    double z = a * b;
                    System.out.println("False the true answer is: " + a + " * " + b + " = " + z );
                }
                break;

            case '/':
                if(a / b == r)
                    System.out.println("The Equation is true");
                else if (a / b != r) {
                    double z = a / b;
                    System.out.println("False the true answer is: " + a + " / " + b + " = " + z );
                }
                break;

            default:
                System.out.println("You Entered a Wrong Operator");



        }


    }
}
