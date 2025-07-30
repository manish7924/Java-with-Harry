

public class JVL_17_Logical_Operators {
    public static void main(String[] args) {

        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        // boolean c = true;

        if (a && b) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical OR...");

        if (a || b) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical Not...");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);

    }
}
