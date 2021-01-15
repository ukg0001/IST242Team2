package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/** 
* SalespersonArray Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class SalespersonArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testSPArray() throws Exception { 
    try{
        SalespersonArray salespersonArray = new SalespersonArray();
        ArrayList<Salesperson> sList = salespersonArray.getSPArray();
        assertEquals(salespersonArray.getSPArray(), sList);
        assertEquals(salespersonArray.getSPArray().get(0).getId(),"9991");
        assertEquals(salespersonArray.getSPArray().get(1).getId(),"9992");
        assertEquals(salespersonArray.getSPArray().get(2).getId(),"9993");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
} 


} 
