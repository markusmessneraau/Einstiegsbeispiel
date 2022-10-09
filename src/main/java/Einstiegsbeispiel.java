import java.util.Arrays;
import java.util.HashMap;




public class Einstiegsbeispiel {

    public static void main(String[] args) {

        int [] arr = {1,1,1,2,2,2,3,3,3,3,4,4,5};


    }









    public  HashMap getRepetitions(int[] arr){

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();



        for (int i = 0; i < arr.length  ; i++) {

            if(numbers.containsKey(arr[i])){

              numbers.computeIfPresent(arr[i], (k,v) -> v+1);

            }else{

                numbers.put(arr[i], 1);
            }


        }

        return numbers;

    }
}
