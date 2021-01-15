package test.edu.psu.abington.ist.ist242; 

import edu.psu.abington.ist.ist242.Customer;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

/** 
* Customer Tester. 
*
* @since April 24, 2020
* @version 1.0 
*/ 
public class CustomerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testListCustomer() throws Exception {
    try{
        Customer customer = new Customer(6);
        ArrayList<Customer> cList = new ArrayList<>();
        for (Customer cust : cList) {
            System.out.println("Customer ID: " + cust.getCustId());
            System.out.println("Customer Name: " + cust.getUserName());
            System.out.println("Customer Phone #: " + cust.getUserPhone());
            System.out.println("Customer Email: " + cust.getCustEmail());
            System.out.println("Customer Address: " + cust.getCustAddress());
            System.out.println("Customer State: " + cust.getCustState());
            System.out.println("Customer City: " + cust.getCustCity());
            System.out.println("Customer Zip: " + cust.getCustZip());
            System.out.println("Role: " + cust.getRole());

            assertEquals(customer.ListCustomer(cList), cList);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}


} 
