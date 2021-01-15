package edu.psu.abington.ist.ist242;

import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/16/2020
 * Revision: 10
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

public class Main {
    public static boolean addVehicle;
    int cCount = 6;
    int vCount = 106;

    public static void main(String[] args) {
        System.out.println("Welcome to the Abington Toyota Dealership!");
        System.out.println("Made by Nick Guenther, Jenna Gorman, Michael Evanik, and Urjita Gandevia");
        Main main = new Main();
        final char EXIT_CODE = 'E';
        final char ADD_CUST = 'C';
        final char LIST_CUST = 'L';
        final char LIST_INV = 'I';
        final char ADD_VEHICLE = 'V';
        final char DELETE_INV = 'D';
        final char LIST_SP = 'S';
        final char PRINT_DEAL = 'T';
        char userAction;
        final String PROMPT_ACTION = "Print Dealership Info: 'T' | Add Customer: 'C' | Add Vehicle: 'V' | List Customers: 'L' | List Inventory: 'I' | Delete Inventory: 'D' | List SalesPersons: 'S' | Exit: 'E'";

        SalespersonArray salespersonArray = new SalespersonArray();
        ArrayList<Salesperson> SPList = salespersonArray.getSPArray();
        CarArrayList carArrayList = new CarArrayList();
        ArrayList<Vehicle> vList = carArrayList.getVHArray();
        CustomerArray customerArray = new CustomerArray();
        ArrayList<Customer> cList = customerArray.getCustomerArray();
        AdministrationArray administrationArray = new AdministrationArray();
        ArrayList<Administration> AdminList = administrationArray.getAdminArray();
        DealershipArray dealershipArray = new DealershipArray();
        ArrayList<Dealership> dealList = dealershipArray.getdealArray();

        Scanner input = new Scanner(System.in);
        userAction = getAction(PROMPT_ACTION);
        //start while loop
        while (userAction != EXIT_CODE) {
            Scanner scanner = new Scanner(System.in);
            String userIds = new String();
            String passwords = new String();
            switch (userAction) {
                // Adding a new customer
                case ADD_CUST:
                    User.validateSalesId(System.in, SPList, userIds);
                    User.validateSalesPass(System.in, SPList, passwords);
                    main.addCustomer(cList);
                    break;
                // Listing existing customers
                case LIST_CUST:
                    User.validateSalesId(System.in, SPList, userIds);
                    User.validateSalesPass(System.in, SPList, passwords);
                    Customer.ListCustomer(cList);
                    break;
                // Adding a new vehicle
                case ADD_VEHICLE:
                    User.validateSalesId(System.in, SPList, userIds);
                    User.validateSalesPass(System.in, SPList, passwords);
                    main.addVehicle(vList);
                    break;
                // Listing inventory
                case LIST_INV:
                    User.validateSalesId(System.in, SPList, userIds);
                    User.validateSalesPass(System.in, SPList, passwords);
                    Inventory.ListVehicle(vList);
                    break;
                // Deleting vehicles
                case DELETE_INV:
                    User.validateSalesId(System.in, SPList, userIds);
                    User.validateSalesPass(System.in, SPList, passwords);
                    Main.removeVehicle(System.in, vList);
                    break;
                case LIST_SP:
                    User.validateAdminId(System.in, AdminList, userIds);
                    User.validateAdminPass(System.in, AdminList, passwords);
                    Salesperson.printSalesperson(SPList);
                    break;
                case PRINT_DEAL:
                    Dealership.printDealership(dealList);
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }

    /**
     * Menu char input, allows user to navigate the menu
     *
     * @param prompt String prompt
     * @return char firstChar
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public static char getAction(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scanner.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    /**
     * Prompts user to add a new customer
     *
     * @param cList ArrayList
     * @return Customer cust object
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public boolean addCustomer(ArrayList<Customer> cList) {
            Customer cust = new Customer(cCount++);
            Scanner scanner = new Scanner(System.in);
            Main.validateUserName(System.in, cust);
            Main.validatePhoneNum(System.in, cust);
            Main.validateUserEmail(System.in, cust);
            System.out.println("Please enter your Street Address: ");
            cust.setCustAddress(scanner.nextLine());
            System.out.println("Please enter your state: ");
            cust.setCustState(scanner.nextLine());
            System.out.println("Please enter your city: ");
            cust.setCustCity(scanner.nextLine());
            System.out.println("Please enter your zip: ");
            cust.setCustZip(scanner.nextLine());
            cust.setRole(Role.Customer);
            System.out.println("You are now a registered customer!");
            cList.add(cust);
            return true;
    }

    /**
     * Prompts user to add a vehicle
     *
     * @param vList ArrayList
     * @return Vehicle car object
     * @author Jenna Gorman
     * @author Nick Guenther
     * @version 1.0
     * @since 2020-04-20
     */
    public boolean addVehicle(ArrayList<Vehicle> vList) {
        int vCount = 106;
        Vehicle car = new Vehicle(vCount++);
        Scanner scanner = new Scanner(System.in);
        Main.validateModel(System.in, car);
        Main.validateColor(System.in, car);
        Main.validatePrice(System.in, car);
        System.out.println("Please enter the License Plate number: ");
        car.setRegistration(scanner.next());//had to replace space with - in the strings
        System.out.println("Vehicle added successfully!");
        vList.add(car);
        return true;
    }

    /**
     * Prompts user to remove a vehicle
     *
     * @param in InputStream in
     * @param vList ArrayList vList from Vehicle
     * @return boolean value true
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean removeVehicle(InputStream in, ArrayList<Vehicle> vList) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter the ID of the Vehicle you wish to remove: ");
            int remove = input.nextInt();
            for(Vehicle car : vList) {
                if(remove == car.getcarId()) {
                    vList.remove(car);
                    System.out.println("Your vehicle has been removed!");
                    return true;
                }
            }
        } while(true);
    }

    /**
     * Validates the enum input for model
     *
     * @param car Vehicle object car
     * @param in InputStream in
     * @return boolean value true
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validateModel(InputStream in, Vehicle car) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter a Toyota Model: ");
            String userModel = input.nextLine();
            for (Model mod : Model.values()) {
                if (userModel.equalsIgnoreCase(mod.name())) {
                    car.setModel(Model.valueOf(userModel));
                    return true;
                }
            }
        } while (true);
    }

    /**
     * Validates the enum input for color
     *
     * @param car Vehicle object car
     * @param in InputStream in
     * @return boolean value true
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validateColor(InputStream in, Vehicle car) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter a Color for your Vehicle: ");
            String userColor = input.nextLine();
            for (Color color : Color.values()) {
                if (userColor.equalsIgnoreCase(color.name())) {
                    car.setColor(Color.valueOf(userColor));
                    return true;
                }
            }
        } while (true);
    }

    /**
     * Validates the price input for the vehicle being added.
     *
     * @param car Vehicle object car
     * @param in InputStream in
     * @return boolean value true
     * @author Nick Guenther
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validatePrice(InputStream in, Vehicle car) {
       boolean valid = false;
       do {
           Scanner input = new Scanner(in);
           try{
               System.out.println("Please enter price of the vehicle (ex. 20000): ");
               float price = input.nextFloat();
               car.setPrice(price);
               valid = true;
           } catch(InputMismatchException e) {
               System.out.println("Invalid price, try again.");
               input.next();
           }
       } while(!valid);
       return true;
    }
    /**
     * Validates String input for UserName
     *
     * @param cust Customer object cust
     * @param in InputStream in
     * @return boolean value true
     * @author Jenna Gorman
     * @author Urjita Gandevia
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validateUserName(InputStream in, Customer cust) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your first and last name: ");
            String userName = input.nextLine();
            if (!userName.isEmpty()) {
                cust.setUserName(userName);
                return true;
            }
        } while (true);
    }
    /**
     * Validates String input for CustomerPhone
     *
     * @param cust Customer object cust
     * @param in InputStream in
     * @return boolean value true
     * @author Jenna Gorman
     * @author Urjita Gandevia
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validatePhoneNum(InputStream in, Customer cust) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your phone #: ");
            String userPhone = input.nextLine();
            if (!userPhone.isEmpty()) {
                cust.setUserPhone(userPhone);
                return true;
            }
        } while (true);
    }
    /**
     * Validates String input for UserEmail
     *
     * @param cust Customer object cust
     * @param in InputStream in
     * @return boolean value true
     * @author Jenna Gorman
     * @version 1.0
     * @since 2020-04-20
     */
    public static boolean validateUserEmail(InputStream in, Customer cust) {
        do {
            Scanner input = new Scanner(in);
            System.out.println("Please enter your email address: ");
            String userEmail = input.nextLine();
            if (!userEmail.isEmpty()) {
                cust.setCustEmail(userEmail);
                return true;
            }
        } while (true);
    }
}


