package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Signup {


 public void signup(){
    System.out.println();
    System.out.println("**********Signup Form**********");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter User Name:-");
    String user_name =sc.nextLine();
    System.out.println("Enter Password:-");
    String password =sc.nextLine();
    
    

    try {
      Connection con = ConnectionProvider.createConnection();
      PreparedStatement pstmt = con.prepareStatement("insert into Admins (user_name, password) values(?,?)");
      pstmt.setString(1,user_name );
      pstmt.setString(2, password);
      pstmt.executeUpdate();
      System.out.println("registration completed successfully!!!");
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
    
  }

}
// CREATE TABLE Admins(id INT primary key AUTO_INCREMENT,user_name CHAR(30) NOT NULL,password CHAR(30) NOT NULL);