/*
1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
*/



/*

CODE:

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        int total = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {   
                total += num;
            }
        }

        System.out.println("Sum of even numbers: " + total);
    }
}


*/

/*
OUTPUT:

Sum of even numbers: 6

*/




//2. Write a Java program  to implement Stack.

/*

CODE:

import java.util.Stack;

public class JavaStackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Peek: " + stack.peek()); // 10
    }
}  

*/  

/*
OUTPUT:

Pop: 20
Peek: 10

*/

