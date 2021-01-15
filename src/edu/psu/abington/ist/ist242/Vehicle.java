package edu.psu.abington.ist.ist242;

/**
 * This class holds details of the vehicle
 * Course: IST 242
 * Date Developed: 3/15/2020
 * Last Date Changed: 4/16/2020
 * Revision: 6
 * @author Jenna Gorman
 * @author Urjita Gandevia
 * @author Nick Guenther
 * @author Michael Evanik
 */

import java.text.DateFormat;
import java.util.ArrayList;


public class Vehicle {
        private int carId;
        private float price;
        private Enum model;
        private Enum color;
        private String registration;


       public Vehicle(int carId) { this.carId = carId; }


// Getters and setters methods
        public int getcarId() { return carId; }
        public void setcarId(int carId) { this.carId = carId;}


        public String getRegistration() { return registration; }
        public void setRegistration(String newRegistration) {this.registration = newRegistration; }

        public Enum getModel() {return model;}
        public void setModel(Model newModel) {this.model = newModel;}

        public Enum getColor() {return color;}
        public void setColor(Color newColor) {color = newColor;}

        public float getPrice() {return price;}
        public void setPrice(float newPrice) {this.price = newPrice;}

}
