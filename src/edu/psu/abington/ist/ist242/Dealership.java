package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds records of the new car Dealership
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed:4/12/2020
 * Revision: 2
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Dealership {

    private String DealershipName;
    private  String DealershipAddress;
    private String DealershipPhoneNumber;

    public void setDealershipAddress(String dealershipAddress) {
        DealershipAddress = dealershipAddress;
    }

    public void setDealershipName(String dealershipName) {
        DealershipName = dealershipName;
    }

    public void setDealershipPhoneNumber(String dealershipPhoneNumber) {
        DealershipPhoneNumber = dealershipPhoneNumber;
    }

    public String getDealershipPhoneNumber() {
        return DealershipPhoneNumber;
    }

    public String getDealershipAddress() {
        return DealershipAddress;
    }

    public String getDealershipName() {
        return DealershipName;
    }
    /**
     * Prints details about the car dealership
     *
     * @param dealList Array List of dealership info
     * @return true boolean value
     * @author Michael Evanik
     * @version 1.0
     * @since 2020-04-24
     */
    public static boolean printDealership(ArrayList<Dealership> dealList) {
        for (Dealership deal : dealList) {
            System.out.println("Dealership Name: " + deal.getDealershipName());
            System.out.println("Dealership Phone #: " + deal.getDealershipPhoneNumber());
            System.out.println("Dealership Address: " + deal.getDealershipAddress());
        }
        return true;
    }
}