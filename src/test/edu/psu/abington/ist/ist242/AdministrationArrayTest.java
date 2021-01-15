package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Administration;
import edu.psu.abington.ist.ist242.AdministrationArray;
import edu.psu.abington.ist.ist242.Role;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.ArrayList;

/** 
* AdministrationArray Tester. 
*
 * @author Jenna Gorman
* @since April 24, 2020
* @version 1.0 
*/ 
public class AdministrationArrayTest {

@Before
public void before() throws Exception {


} 

@After
public void after() throws Exception { 
} 

@Test
public void testAdminArray() throws Exception {
    try{
        AdministrationArray administrationArray = new AdministrationArray();
        ArrayList<Administration> aList = administrationArray.getAdminArray();
        assertEquals(administrationArray.getAdminArray(), aList);
        assertEquals(administrationArray.getAdminArray().get(0).getId(),"9990");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

}


} 
