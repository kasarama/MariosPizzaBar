/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class OrdrerTest {
    
    public OrdrerTest() {
    }

 
    @Test
    public void TestpickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);
        
        //hvis det giver + 30 min så det rigtigt whuuhuu!!
    

    
}
}
