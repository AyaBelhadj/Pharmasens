import java.sql.*;


class Test{
	public static Statement envoi()
	{
		Statement s = null;
		try {
			
			//1- connect to database
				//Connection cnx=DriverManager.getConnection("jbdc:mysql://localhost:3306/pharmasens","root","root");
				
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection
	                       ("jdbc:mysql://localhost/pharmasens","root","root");
				
				
			//2- create a statement
				s=conn.createStatement();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
				
			
		}
		
	}
	


