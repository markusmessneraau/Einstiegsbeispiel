import java.util.HashMap;
import java.util.Map;


public class Einstiegsbeispiel {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5};


    }


    public static HashMap getRepetitions(int[] arr) throws Exception {

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();


        for (int i = 0; i < arr.length; i++) {

            if (numbers.containsKey(arr[i])) {

                numbers.computeIfPresent(arr[i], (k, v) -> v + 1);

            } else {

                numbers.put(arr[i], 1);
            }


        }

        //Check ob sich Sequenzen wiederholen
        if(!checkIfSequenzesRepeat(numbers)){
            throw new Exception();
        }


        return numbers;

    }
    //true wenn sich die Reihe wiederholt
    public static boolean checkIfSequenzesRepeat(HashMap<Integer, Integer> mymap) {


        for (Map.Entry<Integer, Integer> value : mymap.entrySet()) {

            Integer i = value.getValue();

            if (!value.getValue().equals(1)) {

                return true;
            }


        }

        return false;
    }
}
