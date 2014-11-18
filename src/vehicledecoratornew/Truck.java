/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicledecoratornew;

/**
 * A Vehicle implementation.
 * 
 * @author Steven Endres
 */
public class Truck extends Vehicle {
    // private String description;
     
//    public Truck() {
//        description = "Truck";
//    }

    public String description(){
        return "Truck ";
    }
    // provided implementation 
    public double cost () {
        return 30000.00;
    }

}

