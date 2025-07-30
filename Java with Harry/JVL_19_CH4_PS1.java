import java.util.Scanner;

public class JVL_19_CH4_PS1 {
    public static void main(String[] args) {

        // // Q1. What will be the output of this program?
        // int a = 10;
        // if (a=11) {
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }

        // // Solution 1.
        // It shows an error because in if condition place we not assign variable only comapare it.

        // ---------------------------------------


        // // Q2. Write a program to find ot whether a student is pass or fail; if it requires total 40% and at least 33% inn each subject to pass.
        // Assume 3 subjects and take marks as an input from the user.

        // // Solution 2.

        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your marks in Physics: ");
        // m1 = sc.nextByte();

        // System.out.println("Enter your marks in Chemistry: ");
        // m2 = sc.nextByte();

        // System.out.println("Enter your marks in Mathematics: ");
        // m3 = sc.nextByte();

        // float avg = (m1 + m2 + m3) / 3.0f;
        // if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        //     System.out.println("Congratuations, You have been promoted");
        // }
        // else{
        //     System.out.println("Sorry, You have not been promoted! Please try again.");
        // }

        // -----------------------------------


        // // Q3. Calculate income tax paid by an employee to the government as per the slobs mentioned below:
        // Income      slob        Tax
        // 2.5L    -    5.0L       5%
        // 5.0L    -   10.0L       20%
        // Above       10.0L       30%

        // // Solution 3.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Income in Lakhs per Annum");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if (income<=2.5) {
        //     tax = tax + 0;
        // }
        // else if (income>2.5f && income<=5f) {
        //     tax  = tax + 0.05f * (income - 2.5f);
        // }
        // else if (income>5f && income<=10.0f) {
        //     tax  = tax + 0.05f * (5.0f - 2.5f);
        //     tax  = tax + 0.02f * (income - 5f); 
        // }
        // else if (income>10.0f) {
        //     tax  = tax + 0.05f * (5.0f - 2.5f);
        //     tax  = tax + 0.02f * (10.0f - 5f); 
        //     tax  = tax + 0.3f * (income - 10.0f); 
        // }

        // System.out.println("The total tax paid by the employee is: " + tax);

        // -------------------------------------


        // // Q4. Write a java program to find out the day of the weak given number [1 for Monday 2 for Tuesday... and so on!].

        // // Solution 4.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to find a day: ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wedday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        // -------------------------------------


        // // Q5. Write a Java program to find whether a year entered by the user is a leap year or not.

        // // Soution 5.





        // ---------------------------------------------


        // // Q6. Write a program to find out the type of website from the url.
        // // .com -> Commercial website
        // // .org -> Organization website
        // // .in -> Indian website

        // // Solution 6.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter website to find the type: ");
        // String website = sc.next();
        // if (website.endsWith(".org")) {
        //     System.out.println("This is an Organizational website");
        // }
        // else if (website.endsWith(".com")) {
        //     System.out.println("This is an Commercial website");
        // }
        // if (website.endsWith(".in")) {
        //     System.out.println("This is an Indian website");
        // }
    }
}
