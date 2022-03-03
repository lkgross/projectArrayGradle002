package bsu.comp152;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays; // This class contains "built-in" array functionality.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // We can do inline initialization with explicit contents for an array.
        String[] suit_names = {"Diamonds", "Hearts", "Clubs", "Spades"};
        int[] SUIT_INTS = {0, 1, 2, 3};

        // We can do inline initialization of arrays with default values.
        String[] names = new String[5];
        double[] myDoubles = new double[10];
        int[] myIntegers = new int[10];

        // Here println calls a default toString method for (Array) objects:
        // An address for the Array object is printed.
        System.out.println(suit_names);
        System.out.println(names);

        // We can access a public field length for an array.
        System.out.println(suit_names.length);
        System.out.println(names.length);

        // For convenience, we can write a printArray static method.
        printArray(suit_names);

        System.out.println();

        // We can write a static method that returns a string representation of the array.
        System.out.println(arrayReturnString(suit_names));

        System.out.println();

        System.out.println(Arrays.toString(suit_names));

        // We can specify an element in an array at a given index.
        suit_names[0] = "76";

        System.out.println();

        System.out.println(Integer.parseInt(suit_names[0]) + 23);

        System.out.println();

        printArray(suit_names);

        System.out.println();

        // We can loop through an array element-by-element.
        for(String element : suit_names){
            System.out.println(element);
        }

        System.out.println();

        for(String element : names){
            System.out.println(element);
        }

        System.out.println();

        for(int element : myIntegers){
            System.out.println(element);
        }

        System.out.println();

        for(double element : myDoubles){
            System.out.println(element);
        }

        names[0] = "";

        System.out.println();

        for(String element : names){
            System.out.println(element);
        }

        System.out.println();

        System.out.println(names[0]==null);
        System.out.println(names[1]==null);

        System.out.println();

        /* Let's look at ArrayLists.
         * They are different from arrays. They can expand and shrink.
         */

        // We can do an inline initialization of an ArrayList.
        ArrayList<String> roster = new ArrayList<String>();

        // An ArrayList can also be created with a parametrized constructor.
        ArrayList<String> arrayList2 = new ArrayList<String>(100);

        System.out.println();

        System.out.println("Call add to populate the ArrayList.");
        arrayList2.add("Mike");

        // We can also get data from the user to include.
        Scanner console = new Scanner(System.in);

        System.out.println("Whom else would you like to add to the class?");
        arrayList2.add(console.nextLine());

        System.out.println();

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2); // The ArrayList class contains a toString method!

        System.out.println("Call set to overwrite the element at index 0.");
        arrayList2.set(0, "Naomi");

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2); // The ArrayList class contains a toString method!

        System.out.println("Get the element at index 1 in arrayList2:");
        System.out.println(arrayList2.get(1));

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2);

        System.out.println("Remove (and return!) the element at index 0 in arrayList2:");
        System.out.println(arrayList2.remove(0));

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2);

        System.out.println("The size of arrayList2 is:");
        System.out.println(arrayList2.size());

        System.out.println("We can also read from file:");
        File myfile = new File("names002");
        // When I do the following, I put a throws clause in the
        // method header.
        Scanner inputFile = new Scanner(myfile);
        arrayList2.add(inputFile.nextLine());

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2);

    }

    public static void printArray(String[] arr){
        // We can loop through an array index-by-index.
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String arrayReturnString(String[] arr){
        String str = "[";
        for(int i=0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        return str + "]";
    }
}
