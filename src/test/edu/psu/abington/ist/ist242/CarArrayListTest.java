package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* CarArrayList Tester. 
* 
* @author Nick Guenther
* @since April 26, 2020
* @version 1.0 
*/ 
public class CarArrayListTest {


    Vehicle car1;
    private Object CarArrayList;

    @Before
    public void before() throws Exception {
        CarArrayList = new CarArrayList();
       // vehicleId = "12124324";
        car1 = new Vehicle(106);
        car1.setColor(Color.Black);
        car1.setModel(Model.Camry);
        car1.setPrice(22150);
        car1.setRegistration("ARK-1521");

    }

    @After
    public void after() throws Exception {
    }

@Test
public void testVHArray() throws Exception {
    try{
        CarArrayList carArrayList = new CarArrayList();
        ArrayList<Vehicle> vList = carArrayList.getVHArray();
        assertEquals(carArrayList.getVHArray(), vList);
        assertEquals(carArrayList.getVHArray().get(0).getcarId(),101);
        assertEquals(carArrayList.getVHArray().get(1).getcarId(),102);
        assertEquals(carArrayList.getVHArray().get(2).getcarId(),103);
        assertEquals(carArrayList.getVHArray().get(3).getcarId(),104);
        assertEquals(carArrayList.getVHArray().get(4).getcarId(),105);
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }

}


} 
