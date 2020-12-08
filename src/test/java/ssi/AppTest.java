package ssi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;



/**
 * Unit test for simple App.
 */
class AppTest {

    Sort bubblesort;
    App main;

    @BeforeEach
    public void init() {
        bubblesort = Mockito.mock(Sort.class);
//        main = Mockito.mock(App.class);
    }
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {  
        assertEquals(0, bubblesort.getInstanceCount());
    }
}
