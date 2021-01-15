package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Dealership;
import edu.psu.abington.ist.ist242.DealershipArray;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* Dealership Tester. 
* 

* @since April 24, 2020
* @version 1.0 
*/ 
public class DealershipTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

@Test
public void testPrintDealership() throws Exception {
    try {
        Dealership dealership = new Dealership();
        ArrayList<Dealership> dealList = new ArrayList<>();
        for (Dealership deal : dealList) {
            System.out.println("Dealership Name: " + deal.getDealershipName());
            System.out.println("Dealership Phone #: " + deal.getDealershipPhoneNumber());
            System.out.println("Dealership Address: " + deal.getDealershipAddress());
            assertEquals(dealership.printDealership(dealList), dealList);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}


} 
