import java.util.ArrayList;

public class Test {
    public static void main(String[] args){

        ArrayList<String> myStr = new ArrayList<String>(); //? []
        myStr.add("Bob");
        myStr.add("Mike");
        myStr.add("Jake");

        // create an instance of the class Utilities

        Utilities myTools = new Utilities();

        // call the methods
        // myTools.printArray(myStr);

        // ------------
        ArrayList<Integer> numbersArray = new ArrayList<Integer>(); //? []

        numbersArray.add(55);
        numbersArray.add(30);
        numbersArray.add(20);

        String output = myTools.sumArray(numbersArray);
        System.out.println(output);

        // System.out.println("============= \n");

        // String userName = System.console().readLine();

        // System.out.println(userName);

    }
}