package ssi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("checkstyle:magicnumber")
class AppTest {

    private Sort bubblesort;

    /**
     * Mocking Data.
     */
    @BeforeEach
    public void init() {
        bubblesort = Mockito.mock(Sort.class);
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(0, bubblesort.getInstanceCount());
    }

    @Test
    void numberSorted() {
        Sort bub = new Sort();
        int[] ini = {5, 3, 1};
        bub.sort(ini);
        int[] expec = {1, 3, 5};
        assertArrayEquals(expec, ini);
    }

    /**
     * Testing if negative numbers were sorted.
     */
    @Test
    void numberSortedWithNegativeNumber() {
        Sort bub = new Sort();
        int[] i = {-5, 3, 1};
        bub.sort(i);
        int[] e = {-5, 1, 3};
        assertArrayEquals(e, i);
    }

    /**
     * Testing if repeated numbers were considered
     * Testing if repeated numbers were considered.
     */
    @Test
    void numberSortedWithRepeatedNumber() {
        Sort bub = new Sort();
        int[] initial = {-15, 10, 10, 2, 2};
        bub.sort(initial);
        int[] expected = {-15, 2, 2, 10, 10};
        assertArrayEquals(expected, initial);
    }
}
