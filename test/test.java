
import dal.DBContext;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.taglibs.standard.lang.jstl.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguye
 */
public class test {

    public static void main(String[] args) {
        DBContext db = new DBContext();
        try {
            Connection connect = db.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log.(level.SEVERSE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log.(level.SEVERSE, null, ex);
       }
  }
}
