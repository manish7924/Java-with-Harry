
import java.util.Scanner;


public class JVL_18_ElseIf {
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter You age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        // System.out.println("Hello World!");

        // If Else if Ladder
        
        // if (age>56) {
        //     System.out.println("You are Experienced");
        // }
        // else if(age>46){
        //     System.out.println("You are semi-experienced");
        // }
        // else if (age>36) {
        //     System.out.println("You are semi-semi-experienced");
        // }
        // else{
        //     System.out.println("Yo are noot Experienced");
        // }
        // if (age>2) {
        //     System.out.println("Yo are not a baby!");
        // }


        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;

            case 23:
                System.out.println("You are going to going to join a Job!");
                break;

            case 60:
                System.out.println("You are going to got retired!");
                break;
        
            default:
                System.out.println("Enjoy your Life!");

        }


    }
}
