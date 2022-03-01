package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        String[] suit_names = {"Diamonds", "Hearts", "Clubs", "Spades"};
        int[] SUIT_INTS = {0, 1, 2, 3};

        String[] names = new String[5];
        double[] myDoubles = new double[10];
        int[] myIntegers = new int[10];

        System.out.println(suit_names);
        System.out.println(names);

        System.out.println(suit_names.length);
        System.out.println(names.length);

        printArray(suit_names);

        suit_names[0] = "76";

        System.out.println();

        System.out.println(Integer.parseInt(suit_names[0]) + 23);

        System.out.println();

        printArray(suit_names);

        System.out.println();

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

    }

    public static void printArray(String[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
