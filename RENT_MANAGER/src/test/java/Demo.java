import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try{  
			Class.forName("org.h2.Driver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			stmt.executeUpdate("INSERT INTO trn_person VALUES (5, 'sujeet', 'dwivedi', 27)");  
			System.out.println("Person Added!!");
			}catch(Exception e){ System.out.println(e);}
	}

}
