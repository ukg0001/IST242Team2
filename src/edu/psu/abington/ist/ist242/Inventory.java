package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds the inventory of the dealership
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/15/2020
 * Revision: 4
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Inventory {

    /**
     * Lists car details
     *
     * @param vList ArrayList
     * @return true boolean value
     * @author Nick Guenther
     * @version 1.0
     * @since 2020-04-24
     */


    public static boolean ListVehicle(ArrayList<Vehicle> vList) {
        for (Vehicle car : vList) {
            System.out.println("Car ID Number: " + car.getcarId());
            System.out.println("Model Toyota: " + car.getModel());
            System.out.println("Color of the Vehicle: " + car.getColor());
            System.out.println("License Plate Number: " + car.getRegistration());
            System.out.println("Starting Price of the Vehicle: " + car.getPrice());
        }
        return true;
    }
}
