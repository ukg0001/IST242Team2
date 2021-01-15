package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* Main Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class MainTest {

    @Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

@Test
public void testValidateModel() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("Yaris".getBytes());
        assertTrue(Main.validateModel(anyInputStream, new Vehicle(106)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

@Test
public void testValidateColor() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("Pink".getBytes());
        assertTrue(Main.validateColor(anyInputStream, new Vehicle(106)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

@Test
public void testValidatePrice() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("22154".getBytes());
        assertTrue(Main.validatePrice(anyInputStream, new Vehicle(106)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
}


@Test
public void testValidateUserName() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("Jane Smith".getBytes());
        assertTrue(Main.validateUserName(anyInputStream, new Customer(1)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

@Test
public void testValidatePhoneNum() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("867-5309".getBytes());
        assertTrue(Main.validatePhoneNum(anyInputStream, new Customer(1)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

@Test
public void testValidateUserEmail() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("jojo@psu.edu".getBytes());
        assertTrue(Main.validateUserEmail(anyInputStream, new Customer(1)));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

@Test
public void testRemoveVehicle() throws Exception {
    try {
        InputStream anyInputStream = new ByteArrayInputStream("105".getBytes());
        ArrayList<Vehicle> vList = new ArrayList<>();
        assertTrue(Main.removeVehicle(anyInputStream, vList));
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
} 

} 
