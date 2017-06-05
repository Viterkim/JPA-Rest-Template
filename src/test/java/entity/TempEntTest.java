
package entity;

import org.junit.Test;
import static org.junit.Assert.*;


public class TempEntTest {
    
    public TempEntTest() {
    }


    @Test
    public void testGetText() {
        TempEnt t = new TempEnt("dav");
        assertEquals(t.getText(), "dav");
    }

    
}
