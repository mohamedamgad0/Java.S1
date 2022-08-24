import java.util.Scanner;
public class S1A1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 Integers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float x = (2*a+3*b)*(5*c);

        System.out.printf("The Result of the Equation [(2*" + a + ")+(3*" + b +")]*[5*" + c +"] = %.2f",x);



    }
}
