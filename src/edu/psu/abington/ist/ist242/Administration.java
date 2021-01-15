package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds records of the admin
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 3/18/2020
 * Revision: 2
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Administration extends User {
    private static ArrayList<Administration> aList;

    public Administration(String _id) {
        super.setUserId(_id);
    }

    public String getId() {return super.getUserId();}
    public void setId(String newId) {super.setUserId(newId);}

    /**
     * Gets administration details
     *
     * @param aList Administration admin
     * @return true boolean value
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-24
     */
    public static boolean listAdmin(ArrayList<Administration> aList) {
        Administration.aList = aList;
        for (Administration admin : aList) {
            System.out.println("Admin ID:" + admin.getId());
            System.out.println("Admin UserName:" + admin.getUserName());
            System.out.println("Admin Phone:" + admin.getUserPhone());
            System.out.println("Role: " + admin.getRole());
        }
        return true;
    }
}
