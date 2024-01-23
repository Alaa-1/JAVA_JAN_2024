import java.util.ArrayList;
public class Utilities{


    public void printArray(ArrayList<String> someArr){
        for(int i = 0; i< someArr.size(); i++){
            System.out.println(someArr.get(i));
        }
    }
    public String sumArray(ArrayList<Integer> numberArray){
        Integer sum = 0;
        for(Integer element : numberArray){
            sum += element;
        }
        if( sum > 100) {
            return "the sum is too big !!";
        } else {
            return "the sum is less than 100";
        }
    }
}