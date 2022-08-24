import java.util.Scanner;
public class S1A4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Time Taken by Mustafa: ");
        float a = input.nextFloat();

        System.out.println("Enter The Time Taken by Waleed: ");
        float b = input.nextFloat();

        System.out.println("Enter The Time Taken by Youssef: ");
        float c = input.nextFloat();

        System.out.println("Enter The Time Taken by Amr: ");
        float d = input.nextFloat();

        if (a > b && a > c && a > d){
            System.out.println("Mustafa is The Best");
        }

        else if (b > a && b > c && b > d) {
            System.out.println("Waleed is The Best");
        }

        else if (c > a && c > b && c > d) {
            System.out.println("Youssef is The Best");
        }

        else if (d > a && d > b && d > c) {
            System.out.println("Amr is The Best");
        }
        else {
            System.out.println("We Are The Best");
        }
    }
}
