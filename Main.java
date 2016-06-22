/*

Requirements

Please write code that implements various functions, following the requirements in the list below:

Define a function, parameterCount, that accepts an unknown number of String parameters, and prints
out the the number of parameters.

Define a function stringLength, that accepts a String parameter, and prints out the length of the String.

Define a function longestString, that accepts two String parameters of different length, and returns
the String with the longest length. Print the returned value to the command line.

Define a function userInput, asks the user to type something into the command line, uses the Scanner
class we used during the lesson to take the String the user provides in the command line and prints
it back to the command line.

Define a function typeQuit, asks the user to type something into the command line, prints the String,
then continues to ask the user to type something until the user types in quit. Use the Scanner class
we used during the lesson, to take the String the user provides in the command line. hint: this requires
recursion

Bonus

Define a function isEven, that takes an int parameter, and returns true if the number is even, false
if it is not. Print this returned value to the command line. Note how do we know a number is even?

Define a function fibonacci, that takes an int parameter, and prints out the fibonacci sequence up
to that value. Note: Fibonacci sequence: given a number N, the fibonacci sequence equals the sum of
(N-1) + (N-2) hint: this requires recursion
 */

import java.util.Scanner;

public class Main {

    static int parameterCount(String... strings) {
        return strings.length;
    }

    static int stringLength(String string){
        return string.length();
    }

    static String longestString(String string1, String string2){
        if(string1.length() > string2.length()){
            return string1;
        }
        else if(string2.length() > string1.length()){
            return string2;
        }
        else{
            System.out.println("Strings are of equal length, try again!");
            return null;
        }

    }

    static void userInput() {
        Scanner darkly = new Scanner(System.in);
        System.out.print("Type something: ");
        System.out.println("You said: " + darkly.nextLine().toString());
    }

    static void typeQuit() {
        System.out.println("Type something (type 'quit' to quit)");
        Scanner darkly = new Scanner(System.in);

        if (darkly.nextLine().equals("quit"))
            return;

        typeQuit();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int fibonacci(int fibNum) {
        if (fibNum <= 1) {
            return fibNum;
        }
        else{

        return fibonacci(fibNum - 1) + fibonacci(fibNum - 2);

            }
        }

    static void fib_loop(int fibNum){
        for(int i = 2; i <= fibNum; i++) {
            System.out.println(fibonacci(i));

        }
    }

//I'll try again later

    public static void main(String[] args) {
        // write your code here

        System.out.println("TEST CASES");
        System.out.println("__________");
        System.out.println();
        System.out.println("Parameter Count: " + parameterCount("lions", "tigers", "bears"));
        System.out.println("String Length: " + stringLength("four"));
        System.out.println("Longest String: " + longestString("Ford", "Chevy"));
        userInput();
        typeQuit();
        System.out.println("Is 4 even, True or False? " + isEven(4));
        fib_loop(10);

    }
}