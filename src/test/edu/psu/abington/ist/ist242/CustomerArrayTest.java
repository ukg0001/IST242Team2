package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* CustomerArray Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class CustomerArrayTest { 

@Before
public void before() throws Exception {
} 

@After
public void after() throws Exception { 
} 

@Test
public void testCustArray() throws Exception {
    try{
        CustomerArray customerArray = new CustomerArray();
        ArrayList<Customer> cList = customerArray.getCustomerArray();
        assertEquals(customerArray.getCustomerArray(), cList);
        assertEquals(customerArray.getCustomerArray().get(0).getCustId(),1);
        assertEquals(customerArray.getCustomerArray().get(1).getCustId(),2);
        assertEquals(customerArray.getCustomerArray().get(2).getCustId(),3);
        assertEquals(customerArray.getCustomerArray().get(3).getCustId(),4);
        assertEquals(customerArray.getCustomerArray().get(4).getCustId(),5);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

} 


} 
