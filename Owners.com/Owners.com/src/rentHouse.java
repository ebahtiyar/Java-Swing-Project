/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class rentHouse extends Home {
    
    public rentHouse(int price, String numberOfRoom, String connectinPhone, int squaremeters) {
        super(price, numberOfRoom, connectinPhone, squaremeters);
    }
    public  static rentHouse createRent(int price, String numberOfRoom, String connectinPhone, int squaremeters){
        return new  rentHouse(price, numberOfRoom, connectinPhone, squaremeters);
    }
    

  
    
   
    
}
