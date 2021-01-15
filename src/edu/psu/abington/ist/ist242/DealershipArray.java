package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds the dealership array list
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 3/18/2020
 * Revision: 2
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class DealershipArray {
    /**
     * Sets details of the car dealership
     *
     * @param dealList Array list of dealership info
     * @return dealList
     * @author Michael Evanik
     * @version 1.0
     * @since 2020-04-24
     */
    ArrayList<Dealership> dealList = new ArrayList<>();

    public ArrayList<Dealership> getdealArray() {


        Dealership deal1 = new Dealership();
        deal1.setDealershipName("Abington Toyota Dealership");
        deal1.setDealershipPhoneNumber("267-227-3325");
        deal1.setDealershipAddress("123 Old York Rd, Abington PA");

        dealList.add(deal1);
        return dealList;
    }
}
