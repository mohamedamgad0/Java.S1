import java.util.Scanner;
public class S1A2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Pounds: ");
        int pound = input.nextInt();
        int a=0;
        int b=0;
        int c=0;

        while (pound>0){
            if(pound>=50){
                System.out.println("Number of 50 notes : " + (a = pound/50));
                pound = pound % 50;
            }

            else if (pound>=20) {
                System.out.println("Number of 20 notes : " + (b = pound/20));
                pound = pound % 20;
            }

            else if (pound>=1) {
                System.out.println("Number of 1 notes : " + (c = pound/1));
                pound = pound % 1;
            }
        }
        int z = a + b + c;
        System.out.println("The Total Notes = " + z);
    }
}