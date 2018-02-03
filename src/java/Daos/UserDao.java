/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import DTOS.Card;
import DTOS.User;
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
public class UserDao {
    
    private Statement stmt;
    private PreparedStatement pst;
    private ResultSet results;
    private DataBaseManager dbm = new DataBaseManager();
    private Connection con;

   
    
    public void AddUser(User user)
    {   con=dbm.getCon();
         try {
             
             PreparedStatement pst = 
   con.prepareStatement("insert into eCommerce.user(fullName,password,email,phone,country,credit,job,noOfUsedCards,birthDate,address) values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, user.getFullName());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getPhone());
            pst.setString(5, user.getCountry());
            pst.setDouble(6, user.getCredit());
            pst.setString(7, user.getJob());
            pst.setInt(8, user.getNoOfUsedCards());
            pst.setDate(9, user.getBirthDate());
            pst.setString(10, user.getAddress());
            pst.execute();
         } catch (SQLException ex) {
             Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
         } 
         dbm.closeCon(con);
    }
    
    
}
