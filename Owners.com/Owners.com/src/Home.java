/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class Home {
    private int price;
    private String numberOfRoom;
    private String connectinPhone;
    private int squaremeters;

    public Home(int price, String numberOfRoom, String connectinPhone, int squaremeters) {
        this.price = price;
        this.numberOfRoom = numberOfRoom;
        this.connectinPhone = connectinPhone;
        this.squaremeters = squaremeters;
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public String getConnectinPhone() {
        return connectinPhone;
    }

    public int getPrice() {
        return price;
    }

    public int getSquaremeters() {
        return squaremeters;
    }
    
    
    
    
    
    
}
