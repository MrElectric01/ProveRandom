
import prova.ChriClass;
import org.junit.*;
import static org.junit.Assert.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class ChriClassTests {
    private ChriClass cc;
    
    @Before
    public void setup(){
        cc = new ChriClass();
    }
    
    @Test
    public void testChristian(){
        assertEquals(24,cc.Christian());
    }
}
