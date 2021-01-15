package edu.psu.abington.ist.ist242;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class holds records of the new car customer
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/16/2020
 * Revision: 5
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Customer extends User {
    private static ArrayList<Customer> cList;
    int custId;
    String custAddress, custEmail, custState, custCity, custZip;

    public Customer(int _id) { this.custId = _id; }

    // Getters methods

    public int getCustId() {return this.custId;}
    public String getCustAddress() { return custAddress; }
    public String getCustEmail() { return custEmail; }
    public String getCustState() { return custState; }
    public String getCustCity() { return custCity; }
    public String getCustZip() { return custZip; }

    // setters methods
    public void setCustId(int newId) {this.custId = newId;}
    public void setCustAddress(String cAddress) { this.custAddress = cAddress; }
    public void setCustEmail(String cEmail) { this.custEmail = cEmail; }
    public void setCustState(String cState) { this.custState = cState; }
    public void setCustCity(String cCity) { this.custCity = cCity; }
    public void setCustZip(String cZip) { this.custZip = cZip; }
    /**
     * Lists customer details
     *
     * @param cList ArrayList
     * @return true boolean value
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-24
     */
    public static boolean ListCustomer(ArrayList<Customer> cList) {
        Customer.cList = cList;
        for (Customer cust : cList) {
            System.out.println("Customer ID: " + cust.getCustId());
            System.out.println("Customer Name: " + cust.getUserName());
            System.out.println("Customer Phone #: " + cust.getUserPhone());
            System.out.println("Customer Email: " + cust.getCustEmail());
            System.out.println("Customer Address: " + cust.getCustAddress());
            System.out.println("Customer State: " + cust.getCustState());
            System.out.println("Customer City: " + cust.getCustCity());
            System.out.println("Customer Zip: " + cust.getCustZip());
            System.out.println("Role: " + cust.getRole());

        }
        return true;
    }

}
