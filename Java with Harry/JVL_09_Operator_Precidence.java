

public class JVL_09_Operator_Precidence {
    public static void main(String[] args) {
        // System.out.println("");

        // Precedence & Associativity
        // int a = 6*5-34/2;
        /*
            // "/" and "*" has the same precedence
            Hightest precedence goes to * and /. They are then eveluated the basis odd left-to-right associativity
            =30-34/2
            =30-17
            =13
         */

        // int b = 6/5-34*2;
        // so the Associativity is left-to-right
        /*
            =12-34*2
            =12-68
            =-56
         */

        // System.out.println(a);
        // System.out.println(b);


        // #Associativity
        // Associativity tells the directions of executions of operators.
        // It can either be Left to Right or Right to Left

        // *, / --> L to R
        // +, - --> L to R
        // ++, = --> R to L


        // Quick Quiz
        // int x = 6;
        // int y = 1;
        // int k = x * y/2;
        // System.out.println(k);

        int b = 0;
        int c = 0;
        int a = 10;
        int k = (b*b -4*a*c)/(2*a);
        System.out.println(k);


    }
}
