

public class JVL_26_Arrays {
    public static void main(String[] args) {

        /*  Classroom of 500 students - You have to store marks of these 500 students you have 2 options.
        You have 2 options
        1. Create 500 variables
        2. Use Arrays
        */

        // Array: Array is a collection of similar types of data.

        // Array indices starts from 0 and goes till (n-1) where n is the size of the Array.

        // There are three ways to creaate an arry in java

        // 1. Declaration and memory allocation
        // int [] marks = new int[5];   // declaration and memory allocation inline

        // 2. Declaration and then memory allocation
        // int [] marks;                // Declaration
        // marks = new int[5];      // Memory allocation 

        // int [] marks = new int[5];

        // // Initiaiztion
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;
        // // marks[5] = 86;  // throws an error -> Array out of bound  {Index 5 out of bounds for length 5}

        // System.out.println(marks[4]);

        // 3. Declaration, memory allocation and Initiaiztion together
        int [] marks = {98, 43, 79, 99, 80};

        System.out.println(marks[4]);
        

        
    }
}
