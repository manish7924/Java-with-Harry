
import javax.lang.model.element.Element;

public class JVL_27_Arrays {
    public static void main(String[] args) {

        // Integer array
        // int [] marks = {98, 45, 79, 99, 80};
        // floating point array
        // float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};

        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        // String array
        // String [] students = {"Alisha", "Snow", "Soul", "Sanorita", "Arina"};
        // System.out.println(students.length);
        // System.out.println(students[2]);

        int [] marks = {98, 45, 79, 99, 80};
        System.out.println(marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz: -> Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length -1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Quick Quiz: -> Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }


    }
}
