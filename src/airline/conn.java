package airline;

import java.sql.*;  

public class conn{
    public static void main(String[] args)
    { new conn(); }      
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///user","reenu","merryboy");    
            s =c.createStatement(); 

          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
      