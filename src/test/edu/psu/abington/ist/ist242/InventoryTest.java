package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Inventory;
import edu.psu.abington.ist.ist242.Vehicle;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* Inventory Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class InventoryTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testListVehicle() throws Exception {
    try {
        Inventory inventory = new Inventory();
        ArrayList<Vehicle> vList = new ArrayList<>();
        for (Vehicle car : vList) {
            System.out.println("Car ID Number: " + car.getcarId());
            System.out.println("Model Toyota: " + car.getModel());
            System.out.println("Color of the Vehicle: " + car.getColor());
            System.out.println("License Plate Number: " + car.getRegistration());
            System.out.println("Starting Price of the Vehicle: " + car.getPrice());
            assertEquals(inventory.ListVehicle(vList), vList);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
