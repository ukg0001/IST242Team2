package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.CarArrayList;
import edu.psu.abington.ist.ist242.Dealership;
import edu.psu.abington.ist.ist242.DealershipArray;
import edu.psu.abington.ist.ist242.Vehicle;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/** 
* DealershipArray Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class DealershipArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testDealArray() throws Exception { 
    try {
        DealershipArray dealershipArray = new DealershipArray();
        ArrayList<Dealership> dList = dealershipArray.getdealArray();
        assertEquals(dealershipArray.getdealArray(), dList);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
} 


} 
