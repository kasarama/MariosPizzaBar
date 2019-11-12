
package MariosPizzaBAr;

//@Cathrine, Vibeke, Matti og Magdalena

import java.sql.SQLException;


// Link til repository: https://github.com/kasarama/MariosPizzaBar

public class MariosPizzaBar {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBStatistik db=new DBStatistik();
        db.LæsStatistikSnitPris();
    }
}
