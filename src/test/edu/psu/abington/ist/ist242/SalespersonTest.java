package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Salesperson;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.ArrayList;

/** 
* Salesperson Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class SalespersonTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

@Test
public void testPrintSalesperson() throws Exception {
    try {
        Salesperson salesperson = new Salesperson();
        ArrayList<Salesperson> SPList = new ArrayList<>();
        for (Salesperson sperson : SPList) {
            System.out.println("Salesperson Id: " + sperson.getUserId());
            System.out.println("Salesperson Name: " + sperson.getUserName());
            System.out.println("Salesperson Phone #: " + sperson.getUserPhone());
            System.out.println("Role: " + sperson.getRole());
            assertEquals(salesperson.printSalesperson(SPList), SPList);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}


} 
