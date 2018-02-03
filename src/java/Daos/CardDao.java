/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import DTOS.Card;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3alilio
 */

   
public class CardDao {
    
    private Statement stmt;
    private PreparedStatement pst;
    private ResultSet results;
    private DataBaseManager dbm = new DataBaseManager();
    private Connection con;

    
    
    public Card getCardInfo(int id)
    {   
         try {
             con=dbm.getCon();
             PreparedStatement pst = con.prepareStatement("Select * from eCommerce.creditcard where id = ? ");
             pst.setInt(1, id);
             Card cd= new Card();
             return cd;
         } catch (SQLException ex) {
             Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return null;
    }
    
}
