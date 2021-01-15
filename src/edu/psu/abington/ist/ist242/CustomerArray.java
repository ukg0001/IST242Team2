package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds the customer array list of the dealership
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/5/2020
 * Revision: 4
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class CustomerArray {
    /**
     * Sets customer details
     *
     * @param cList ArrayList of customers
     * @return Array List of customers
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-24
     */
    ArrayList<Customer> cList = new ArrayList<> ();

    public ArrayList<Customer> getCustomerArray(){

        Customer cust1 = new Customer(1);
        cust1.setUserName("Jane Smith");
        cust1.setUserPhone("456-777-7777");
        cust1.setCustEmail("jsmith@psu.edu");
        cust1.setCustAddress("555 Green Ave");
        cust1.setCustState("PA");
        cust1.setCustCity("Philadelphia");
        cust1.setCustZip("19116");
        cust1.setRole(Role.Customer);

        Customer cust2 = new Customer(2);
        cust2.setUserName("John Green");
        cust2.setUserPhone("456-999-3333");
        cust2.setCustEmail("jgreen@psu.edu");
        cust2.setCustAddress("123 Brown Rd");
        cust2.setCustState("PA");
        cust2.setCustCity("Hawkins");
        cust2.setCustZip("08075");
        cust2.setRole(Role.Customer);


        Customer cust3 = new Customer(3);
        cust3.setUserName("Tom Harrison");
        cust3.setUserPhone("456-999-3333");
        cust3.setCustEmail("tharrison@psu.edu");
        cust3.setCustAddress("567 Fun St");
        cust3.setCustState("PA");
        cust3.setCustCity("Rosewood");
        cust3.setCustZip("09089");
        cust3.setRole(Role.Customer);

        Customer cust4 = new Customer(4);
        cust4.setUserName("Sophia Brown");
        cust4.setUserPhone("456-844-3333");
        cust4.setCustEmail("sbrown@psu.edu");
        cust4.setCustAddress("12 Creek Rd");
        cust4.setCustState("PA");
        cust4.setCustCity("Hamilton");
        cust4.setCustZip("19089");
        cust4.setRole(Role.Customer);

        Customer cust5 = new Customer(5);
        cust5.setUserName("Rachel Worth");
        cust5.setUserPhone("456-222-4444");
        cust5.setCustEmail("rworth@psu.edu");
        cust5.setCustAddress("22 Creek Rd");
        cust5.setCustState("PA");
        cust5.setCustCity("Hamilton");
        cust5.setCustZip("19089");
        cust5.setRole(Role.Customer);

        //adding customers to the customer array
        cList.add(cust1);
        cList.add(cust2);
        cList.add(cust3);
        cList.add(cust4);
        cList.add(cust5);

        return cList;

    }

}
