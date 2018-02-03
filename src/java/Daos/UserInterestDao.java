/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import DTOS.User;

/**
 *
 * @author 3alilio
 */
public class UserInterestDao {
    
    
     public static void main(String[] args) {
        User a1 =new User("Hesham Muhamed", "253fdfjf", 100, "31 street", "010012205","Hesham@h.com");
        UserDao dao = new UserDao();
        dao.AddUser(a1);
    }
     
}
