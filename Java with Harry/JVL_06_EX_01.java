
import java.util.Scanner;

public class JVL_06_EX_01 {
    public static void main(String[] args) {
        // Write a program to calculate percentage of a given students in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100).

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1: ");
        int s1 = sc.nextInt();

        System.out.println("Enter the marks of subject 2: ");
        int s2 = sc.nextInt();

        System.out.println("Enter the marks of subject 3: ");
        int s3 = sc.nextInt();

        System.out.println("Enter the marks of subject 4: ");
        int s4 = sc.nextInt();

        System.out.println("Enter the marks of subject 5: ");
        int s5 = sc.nextInt();

        System.out.println("Enter the marks of subject 6: ");
        int s6 = sc.nextInt();

        int sum = (s1 + s2 + s3 + s4 + s5 + s6)/6;
        System.out.println("The total marks of all subjects are : "+sum);
        

    }
}