/*
1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]
*/

/*

public class ArrayException {
    public static void main(String[] args) {

        int[] num = {1, 2, 4, 7, 6,10,11};
      
        for (int i = 0; i <= num.length; i++) {
            System.out.println("Element at the index " + i + " =" + num[i]);
        }
    }
}

*/

/*

OUTPUT:

Element at the index 0  = 1
Element at the index 1 = 2
Element at the index 2 = 4
Element at the index 3 = 7
Element at the index 4 = 6
Element at the index 5 = 10
Element at the index 6 = 11
ERROR!
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7 at ArrayException.main(Main.java:8)

*/
_____________________________________________________________________________________________________________________________


//2.Create program for Custom Exception.


/*
CODE:

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int number = -1;

            if (number < 0) {
                throw new MyException("Number should be positive");
            }

            System.out.println("Entered number is valid");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


*/


/*
OUTPUT:

Number should be positive

*/