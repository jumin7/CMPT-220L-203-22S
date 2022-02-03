package base;

import java.util.Scanner;

public class Main {
    /**
     * # Lab Two
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println ("Enter a random integer");
        num1 = scan.nextInt();
        System.out.println ("Enter another random integer");
        num2 = scan.nextInt();


        
        if (num1< num2) {
            System.out.println ("The first number is smaller than second");
        } else if ( num2 < num1) {
            System.out.println ("The second number is smaller than first");
        } else {
            System.out.println ("they are equal");
        }
        // Make an if statement that triggers a print or println statement
        // Make an if, else statement where the else statement triggers a print or println statement
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        // Make 2 variables and use them in an if else conditional print from one of the sections
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
    }
}
