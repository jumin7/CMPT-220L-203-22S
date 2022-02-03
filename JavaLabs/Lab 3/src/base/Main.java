package base;


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


        // Make an if statement that triggers a print or println statement
        int x = 10;

        if (x < 20) {
            System.out.println(" X is less than 20.");
        }

        // Make an if, else statement where the else statement triggers a print or println statement
        int num = 2;

        if (num > x){
            System.out.println ("2 is greater than x");
        } else {
            System.out.println ("num 1 is smalleer than x .");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement

        int a = 2;

        if (a != 2) {
            System.out.println("Not equal");
        } else if (a == 2){
            System.out.println ("a is equal to 2.");
        } else {
            System.out.println ("Something is wrong");
        }

        // Make 2 variables and use them in an if else conditional print from one of the sections
        int age = 18;
        int height = 150;
        

        if (age >= 18){
            System.out.println (" You are eligible.");
        } else {
            System.out.println (" You are not eligible");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        if ((age >= 18) && (height >= 150)){
            System.out.println ("You are eligible to compete.");
        }else {
            System.out.println ("Something went wrong");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        int age2 =16;
        int height2 =152;

        if ((age2 < 18) || (height2 < 150)){
            System.out.println ("You are not eligible to compete in the game.");
        }else {
            System.out.println ("Something is wrong");
        }
    }
}
