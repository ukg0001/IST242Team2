package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * This class holds administration array list
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 3/18/2020
 * Revision: 2
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class AdministrationArray {
    /**
     * Setting administration details
     *
     * @return AdminList
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-24
     */
    ArrayList<Administration> AdminList = new ArrayList<>();

    public ArrayList<Administration> getAdminArray() {
        //ArrayList<Administration> AdminList = new ArrayList<>();
        Administration Admin = new Administration("9990");
        Admin.setUserName("Gary Cahill");
        Admin.setUserPhone("610-555-5555");
        Admin.setPassword("F123");
        Admin.setRole(Role.Administrator);
        AdminList.add(Admin);
        return AdminList;
    }
}
