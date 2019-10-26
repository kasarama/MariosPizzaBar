package MariosPizzaBAr;

import java.util.Calendar;

/*


 
 */
public class OrderFactory {
    
    public String pickUpTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, +(30));

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        return hour + ":" + minute + ":" + second;
    }
    
    public orderFactory() {
        this.nummer = nummerMax++;
    //    this.ordrer = ordrer;
        afTid = pickUpTime();
        //this.samletPris = ordrer.samletPris();
        this.samletPris = samletPris();
        //Date date = new Date();
        //System.out.println(new Timestamp(date.getTime()));
        SendOrderToArkiv();
}
