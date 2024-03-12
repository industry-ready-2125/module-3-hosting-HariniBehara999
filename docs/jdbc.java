 import java.sql.*;  
public class jdbc{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/InspireBeyondBooks","root","janirams");  
Statement statement=connect.createStatement();  
statement.executeUpdate("create table Books(id int,nameofbook varchar(40),author varchar(40),price int)");
statement.executeUpdate("insert into Books values(1,'A Guide to Sociology','Srushti',1000)");  
statement.executeUpdate("insert into Books values(2,'Five Steps to Success','Veerendranath',799)");
statement.executeUpdate("insert into Books values(3,'Wings of Fire','Abdul Kalam',1235)");
statement.executeUpdate("insert into Books values(4,'sense of Humour','Tenali ramakrishna',850)");
statement.executeUpdate("update Books set price=1100 where author='Srushti'");
statement.executeUpdate("delete from Books where id=4");
String query="select id,nameofbook from Books";
ResultSet result = statement.executeQuery(query);  
while (result.next()) {
    System.out.println("ID: " +result.getInt("id"));
    System.out.println("Name of Book: " +result.getString("nameofbook"));
} 
connect.close();  
System.out.println("The Connection has been established successfully and check your Books database for output. ");  
}
catch(Exception e)
{ 
    System.out.println(e);
}  
  
}  
}  