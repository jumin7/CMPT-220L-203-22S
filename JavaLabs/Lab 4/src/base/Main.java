package base;
import java.lang.Math;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String animal = "tiger";
        switch (animal){
            case "sheep":
                System.out.println ("A sheep is a herbivore. They have fluffy fur");
                break;
            case "tiger":
                System.out.println ("A tiger is a carnivore. It is orange with black stripes");
                break;
            case "shark":
                System.out.println ("A shark is a carnivore. It is an aquatic predator");
                break;
            default:
                System.out.println ("Invalid input. Try a different name");
        }
        // Line of commands that tests each of the function
        int[] exampleArray = { 1,2,3,1,1 };

        System.out.println( summation(exampleArray));
        System.out.println( repetition(1,exampleArray));
        System.out.println ( power(3,2));
        System.out.println(pythagorean(3,4));



        // Give me an example of you using a for loop
        String[] flowers = {"Daisy", "Lilly", "Lotus", "Sunflower"};
        for (String i : flowers) {
            System.out.println(i);
          }

        // Give me an example of you using a while loop
        int age = 0;
        while (age < 18) {
            System.out.println("You are not eligible to compete. You are too young.");
            age = age + 6 ;
        }   
        
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
   
    static double power(int base, int power){
        double result = Math.pow(base,power);
        return result;
    }


    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    //int repetition( int search, int array)
    static int repetition(int search, int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search){
                count = count+1;
             }
          } return(count);

    }
    

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    static int summation(int [] array){
        int sum = 0;
        for (int j= 0; j < array.length; j++) {
            sum = array[j] + sum;
        } return (sum);

    }
    
    
    


    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */
    
    static double pythagorean(int a, int b) {
        double aSquared = power(a,2);
        double bSquared = power(b,2);
        double sum = addition(aSquared, bSquared);
        double c = Math.sqrt(sum);
        return c;     
    }

    static double addition(double a, double b) {
        double answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
