/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class Person {
private String Fullname;
private String phone;
private String nick_name;
private String password;

    public Person(String Fullname, String phone, String nick_name, String password) {
        this.Fullname = Fullname;
        this.phone = phone;
        this.nick_name = nick_name;
        this.password = password;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getPhone() {
        return phone;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getPassword() {
        return password;
    }

    


    




    }




