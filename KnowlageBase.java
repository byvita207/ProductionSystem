package test;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;

public class KnowlageBase {
	
	public static String GetKB(String S, String R)  throws ClassNotFoundException, SQLException{
		String res="";
	String url="jdbc:mysql://localhost:3306/bd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"    ;   
    String username="root";
    String password="root";
    Class.forName("com.mysql.cj.jdbc.Driver");
    try(Connection conn = DriverManager.getConnection(url, username, password);
    Statement statement = conn.createStatement())
    {
     ResultSet resultSet=statement.executeQuery( "SELECT * from knowledge_base");
    
     while(resultSet.next()) {
    	 String point=resultSet.getString(2);
    	 String rr=resultSet.getString(3);
    	 String result=resultSet.getString(4);
    	 if(S.equals(point) && R.equals(rr)) res=result;
     }
    }
	return res;
	}   
    
}
	
        


	
	


