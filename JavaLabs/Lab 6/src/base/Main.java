package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] prime = {2,3,5,7,11};
        System.out.println ("The first 5 pime numbers are");
        for (int i = 0; i < prime.length; i++){
            System.out.println(prime[i]);
        
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Rice");
        shoppingList.add("Oil");
        shoppingList.add("Milk");

        System.out.println (shoppingList);

        // Create an LinkedList, Populate it, and Print it out
        LinkedList<String> menu = new LinkedList<String>();
        menu.add ("Pizza");
        menu.add ("Pasta");
        menu.add ("Soup");
        menu.add ("Salad");
        menu.add ("Dumplings");
        
        System.out.println (menu);

        // Create an Queue, Populate it, and Print it out

        Queue<String> line = new LinkedList<String>();
        line.add("Jumin");
        line.add("Sharon");
        line.add("Sumi");
        line.add("Salama");

        System.out.println(line.element());
        line.remove();
        System.out.println(line.element());// checking to the effect

        // Create an Stack, Populate it, and Print it out
        Stack<String> plates = new Stack<String>();

        plates.push("First");
        plates.push("Second");
        plates.push("Third");
        plates.push("Fourth");
        plates.push("Last");

        System.out.println(plates);
        plates.pop();
        System.out.println(plates);


        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant p1= new Plant (true,"Rosacae","Rose",100,8);
        System.out.println (p1.needsWatering);


        
    }
}
