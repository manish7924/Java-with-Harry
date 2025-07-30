import java.util.Scanner;

public class JVL_05_Input_From_User {
    public static void main(String[] args) {

        // System.in for getting input from keyboard of a System

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number 1: ");

        // // nextInt for getting integer value
        // // int a = sc.nextInt();

        // // same as nextFloat for getting integer value
        // float a = sc.nextFloat();

        // System.out.println("Enter number 2: ");
        // // int b = sc.nextInt();

        // float b = sc.nextFloat();

        // // int sum = a + b;
        // float sum = a + b;

        // System.out.println("The sum of these numbers is: ");
        // System.out.println(sum);


        // // For checking the given value is integer or not
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // // the next is only get one word of a string 
        // String str = sc.next();
        // System.out.println(str);


        // the nextLine is gets the whole string Line
        String str = sc.nextLine();
        System.out.println(str);

    }
}