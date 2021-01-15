package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds details of the salesperson
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/13/2020
 * Revision: 4
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Salesperson extends User {
    private static ArrayList<Salesperson> SPList;

    public Salesperson(String _id) {
        super.setUserId(_id);
    }

    public Salesperson() {
    }

    // Getters and setters methods
    public String getId() {return super.getUserId();}
    public void setId(String newId) {super.setUserId(newId);}
    /**
     * Gets details of the salesperson
     *
     * @param SPList Array List of salespeople
     * @author Jenna Gorman
     * @return true boolean value
     * @version 1.0
     * @since 2020-04-24
     */
    public static boolean printSalesperson(ArrayList<Salesperson> SPList) {
        Salesperson.SPList = SPList;
        for (Salesperson sperson : SPList) {
            System.out.println("Salesperson Id: " + sperson.getUserId());
            System.out.println("Salesperson Name: " + sperson.getUserName());
            System.out.println("Salesperson Phone #: " + sperson.getUserPhone());
            System.out.println("Role: " + sperson.getRole());
        }
        return true;
    }
}
