package ssi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class SortTest {
    @Test
    void numberSorted() {
        Sort algoritm = new Sort();
        int[] initial = {5, 3, 1};   
        algoritm.sort(initial);
        int[] expected = {1, 3, 5};   
        assertArrayEquals(expected, initial);    
    }    
    /**
     * Testing if negative number were sorted
     * Testing if negative number were sorted.
     */
    @Test
    void numberSortedWithNegativeNumber() {
        Sort algoritm = new Sort();
        int[] initial = {-5, 3, 1};
        algoritm.sort(initial);
        int[] expected = {-5, 1, 3};   
        assertArrayEquals(expected, initial);  
    }        

    /**
     * Testing if repeated numbers were considered
     * Testing if repeated numbers were considered.
     */
    @Test
    void numberSortedWithRepeatedNumber() {
        Sort algoritm = new Sort();
        int[] initial = {-15, 10, 10, 2, 2};
        algoritm.sort(initial);
        int[] expected = {-15, 2, 2, 10, 10};   
        assertArrayEquals(expected, initial);  
    }        
}
