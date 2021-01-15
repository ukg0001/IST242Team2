package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.*;
import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/** 
* User Tester. 
*
 * @author Jenna Gorman, Urjita Gandevia
* @since April 24, 2020
* @version 1.0 
*/ 
public class UserTest { 

@Before
public void before() throws Exception {
} 

@After
public void after() throws Exception {
}

@Test
public void testValidateAdminId() throws Exception {
    try {
        InputStream in = new ByteArrayInputStream("9990".getBytes());
        ArrayList<Administration> aList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        assertTrue(User.validateAdminId(in, aList, scanner.next()));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

@Test
public void testValidateAdminPass() throws Exception {
    try {
        InputStream in = new ByteArrayInputStream("F123".getBytes());
        ArrayList<Administration> aList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        assertTrue(User.validateAdminPass(in, aList, scanner.next()));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
} 

@Test
public void testValidateSalesId() throws Exception {
    try {
        InputStream in = new ByteArrayInputStream("9991".getBytes());
        ArrayList<Salesperson> SPList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        assertTrue(User.validateSalesId(in, SPList, scanner.next()));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
} 

@Test
public void testValidateSalesPass() throws Exception {
    try {
        InputStream in = new ByteArrayInputStream("G123".getBytes());
        ArrayList<Salesperson> SPList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        assertTrue(User.validateSalesPass(in, SPList, scanner.next()));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
} 
