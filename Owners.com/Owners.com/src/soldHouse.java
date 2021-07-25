/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class soldHouse extends Home{
    
    public soldHouse(int price, String numberOfRoom, String connectinPhone, int squaremeters) {
        super(price, numberOfRoom, connectinPhone, squaremeters);
    }
     public  static soldHouse createContact(int price, String numberOfRoom, String connectinPhone, int squaremeters){
        return new soldHouse(price, numberOfRoom, connectinPhone, squaremeters);
    }
    
}
