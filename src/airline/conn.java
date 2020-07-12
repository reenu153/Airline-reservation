package airline;

import java.sql.*;  

public class conn{
    public static void main(String[] args)
    { new conn(); }      
    
    Statement s;
    public conn(){  
        try{  
            Connection c;
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///user","reenu","merryboy");    
            s =c.createStatement();           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
      