/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class User extends Person {

    public User(String Fullname, String phone, String nick_name, String password) {
        super(Fullname, phone, nick_name, password);
    }
    
    public  static User createContact(String Fullname, String phone, String nick_name, String password){
        return new User(Fullname, phone, nick_name, password);
    }

    

    
    
    
}
