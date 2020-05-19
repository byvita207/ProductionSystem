package test;

import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Logging {
	public static void PrintChain(ArrayList<String> lChain) throws ClassNotFoundException, SQLException
    { Date date = new Date();
    String Chain="";
    String day=date.toString();
    
		if (lChain.size() > 0)
        {
          
            Chain += lChain.get(0);

            for (int i = 1; i < lChain.size(); i++)
                Chain += " -> " + lChain.get(i);
    }
		String url="jdbc:mysql://localhost:3306/bd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"    ;   
	    String username="root";
	    String password="root";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    String query =String.format("INSERT INTO fact_base(date, chain) VALUES ('%s','%s')", day, Chain);
	    Connection conn = DriverManager.getConnection(url, username, password);
	    		PreparedStatement statement = conn.prepareStatement( query  );
	    		//statement.setString(1,day);
	    		//statement.setString(2,Chain);
	    		statement.executeUpdate(query);
       
}
}
