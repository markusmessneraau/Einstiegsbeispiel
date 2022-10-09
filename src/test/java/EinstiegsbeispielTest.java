import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class EinstiegsbeispielTest {
    
    @DisplayName("Write assertions for hash table")
    class HashTableTest{

        Einstiegsbeispiel bsp = new Einstiegsbeispiel();
        int [] arr = {1,1,1,2,2,2,3,3,3,3,4,4,5};


        @Test
        public void Test{
            HashMap<Integer, Integer> EXPECTED = new HashMap<Integer, Integer>();
            EXPECTED.put(1, 3);
            EXPECTED.put(2, 3);


        }




    }



}


