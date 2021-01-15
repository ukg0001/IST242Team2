package edu.psu.abington.ist.ist242;

/**
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/16/2020
 * Revision: 5
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

import java.util.ArrayList;
import java.util.List;

public class CarArrayList {
        /**
         * Sets values for the vehicle
         * @param vList vehicle array list
         * @return vList List of vehicles
         * @author Nick Guenther
         * @version 1.0
         * @since 2020-04-24
         */
        ArrayList<Vehicle> vList = new ArrayList<>();

        public ArrayList<Vehicle> getVHArray() {

        Vehicle car1 = new Vehicle(101);
                car1.setModel(Model.Camry);
                car1.setColor(Color.Black);
                car1.setPrice(24425);
                car1.setRegistration("CUP-2020");
                vList.add(car1);

        Vehicle car2 = new Vehicle(102);
                car2.setModel(Model.Yaris);
                car2.setColor(Color.Pink);
                car2.setPrice(17750);
                car2.setRegistration("ITS-PINK");
                vList.add(car2);


        Vehicle car3 = new Vehicle(103);
                car3.setModel(Model.Supra);
                car3.setColor(Color.Yellow);
                car3.setPrice(49990);
                car3.setRegistration("XFINITY");
                vList.add(car3);

        Vehicle car4 = new Vehicle(104);
                car4.setModel(Model.Tundra);
                car4.setColor(Color.Silver);
                car4.setPrice(33575);
                car4.setRegistration("GOTS2020");
                vList.add(car4);

        Vehicle car5 = new Vehicle(105);
                car5.setModel(Model.Corolla);
                car5.setColor(Color.White);
                car5.setPrice(19600);
                car5.setRegistration("PSU-2021");
                vList.add(car5);

        return vList;

    }

}
