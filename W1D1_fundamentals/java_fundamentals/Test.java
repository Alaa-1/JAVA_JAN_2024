import java.util.Arrays;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args){
        // System.out.println("Hello Spring !!!");
        // --- Varibales ---

        //! PRIMITIVES

        int x = 3;
        boolean vote = true;
        double tax = 6.7;
        float y = 3.14f;
        char letter = 'a';

        //* Compostie Types (Class Wrappers)
        Integer yy = 125;
        String name = "Joe";
        Boolean isAdmin = false;
        Double pie = 3.14;

        // ---- String ----
        String a = "Jamie";
        String b = "Smith";
        String c = "Jamie";
        // System.out.println(a.equals(c));
        String result = a.concat(b);
        //  System.out.println(result);
        boolean isThere = a.contains("ie");
        //  System.out.println(isThere);
        // System.out.println(b.length());
        
        // === Arrays === (Fixed)
        int[] numbers; // declaring the variable
        numbers = new int[3]; // instantiate

        numbers[0] = 55;
        numbers[1] = 201;
        numbers[2] = 1;
        // numbers[3] = 7;
        // System.out.println(Arrays.toString(numbers));

        int[] myArray = {33, 44, 55};
        // System.out.println(Arrays.toString(myArray));
        // for(int i = 0; i<myArray.length; i++){
        //     System.out.println(myArray[i]);
        // }

        // --- ArrayList --- (Dynamic)
        ArrayList<Integer> myIntegers = new ArrayList<Integer>();
        myIntegers.add(5);
        myIntegers.add(56);
        myIntegers.add(0,8);
        // System.out.println(myIntegers);

        // for(int i = 0; i<myIntegers.size(); i++){
        //     System.out.println(myIntegers.get(i));
        // }

        // ----- Instantiate methods from other places
        AnotherFile example = new AnotherFile();
        // System.out.println(example);
        example.sayHi();
        System.out.println(example.sayHi("Jane"));
        
    }
}