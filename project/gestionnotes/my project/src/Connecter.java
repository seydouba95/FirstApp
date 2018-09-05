
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seydou ba
 */
  public class Connecter {
    Connection con;
    public Connecter(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        //pour afficher l'erreur
        }
        try{
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","");
        }catch(SQLException e){ System.out.println(e);
                              }
    }
            
        Connection obtenirconnexion(){
               return con;
    }
        
        
    }
    

