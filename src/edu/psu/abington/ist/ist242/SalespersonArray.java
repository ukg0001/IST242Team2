package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds an Array list of the salespeople
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 3/18/2020
 * Revision: 2
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class SalespersonArray {
    /**
     * Lists administration staff
     *
     * @param SPList Sales peron array list
     * @return Salesperson list
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-24
     */
    ArrayList<Salesperson> SPList = new ArrayList<> ();

    public ArrayList<Salesperson> getSPArray() {
        Salesperson SP1 = new Salesperson();
        SP1.setUserId("9991");
        SP1.setUserName("John Terry");
        SP1.setUserPhone("123-456-7890");
        SP1.setPassword("G123");
        SP1.setRole(Role.SalesPerson);

        Salesperson SP2 = new Salesperson();
        SP2.setUserId("9992");
        SP2.setUserName("Frank Lampard");
        SP2.setUserPhone("123-098-7654");
        SP2.setPassword("H123");
        SP2.setRole(Role.SalesPerson);

        Salesperson SP3 = new Salesperson();
        SP3.setUserId("9993");
        SP3.setUserName("Ross Barkley");
        SP3.setUserPhone("123-654-0987");
        SP3.setPassword("I123");
        SP3.setRole(Role.SalesPerson);

        //adding salespeople to salesperson array
        SPList.add(SP1);
        SPList.add(SP2);
        SPList.add(SP3);

        return SPList;

    }
}
