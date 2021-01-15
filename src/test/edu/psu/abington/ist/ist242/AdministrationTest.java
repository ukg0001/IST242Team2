package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Administration;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* Administration Tester. 
*
 * @author Jenna Gorman
* @since April 24, 2020
* @version 1.0 
*/ 
public class AdministrationTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testListAdmin() throws Exception {
    try {
        Administration administration = new Administration("2");
        ArrayList<Administration> aList = new ArrayList<>();
        for (Administration admin : aList) {
            System.out.println("Admin ID:" + admin.getId());
            System.out.println("Admin UserName:" + admin.getUserName());
            System.out.println("Admin Phone:" + admin.getUserPhone());
            System.out.println("Role: " + admin.getRole());

            assertEquals(administration.listAdmin(aList), aList);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}


} 
