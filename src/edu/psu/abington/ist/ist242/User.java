package edu.psu.abington.ist.ist242;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class holds the users of the dealership
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/16/2020
 * Revision: 5
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class User {

    String userId;
    String userName;
    String userPhone;
    Role role;
    String password;


    public User() {
    }

    public User(String _userName, String _userPhone, Role _role) {
        userName = _userName;
        userPhone = _userPhone;
        role = _role;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String _password) {
        this.password = _password;
    }

    /**
     * Validates admin ID
     *
     * @param in InputStream in
     * @param aList array list of administrators
     * @param userIds String of userIds
     * @return Admin ID
     * @author Joe Oakes
     * @version 1.0
     * @since 2020-04-24
     */


    public static boolean validateAdminId(InputStream in, ArrayList<Administration> aList, String userIds){
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your userId: ");
            userIds = input.nextLine();
            for(Administration admin : aList) {
                if(userIds.equals(admin.getId())){
                    return true;
                }
            }
        }while(true);
    }

    /**
     * Validates admin password
     *
     * @param in InputStream in
     * @param aList array list for administrators
     * @param passwords String of passwords
     * @return Admin password
     * @author Joe Oakes
     * @version 1.0
     * @since 2020-04-24
     */

    public static boolean validateAdminPass(InputStream in, ArrayList<Administration> aList, String passwords) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your password: ");
            String userPass = input.nextLine();
            for (Administration admin : aList) {
                if (userPass.equals(admin.getPassword())) {
                    return true;
                }
            }
        } while (true);
    }

    /**
     * Validates salesperson ID
     *
     * @param in InputStream in
     * @param SPList array list for salespeople
     * @param userId String of userIds
     * @return salesperson ID
     * @author Joe Oakes
     * @version 1.0
     * @since 2020-04-24
     */

    public static boolean validateSalesId(InputStream in, ArrayList<Salesperson> SPList, String userId){
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your userId: ");
            String userIds = input.nextLine();
            for (Salesperson sp : SPList) {
                if(userIds.equals(sp.getId())){
                    return true;
                }
            }
        }while(true);

        /**
         * Validates salesperson password
         *
         * @param in InputStream in
         * @param SPList array list for sales person
         * @param password String of password
         * @return salesperson password
         * @author Joe Oakes
         * @version 1.0
         * @since 2020-04-24
         */

    }public static boolean validateSalesPass(InputStream in, ArrayList<Salesperson> SPList, String password){
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your password: ");
            String userPass = input.nextLine();
            for (Salesperson sp : SPList) {
                if(userPass.equals(sp.getPassword())){
                    return true;
                }
            }
        }while(true);
    }
}
