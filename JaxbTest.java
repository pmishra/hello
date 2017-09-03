package jaxbTest;

import java.io.File;
import javax.xml.bind.*;

public class JaxbTest {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("Customer.class");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        // Unmarshal Customer
        File customerXML = new File("src/jaxbTest/customer.xml");
        Customer customer = (Customer) unmarshaller.unmarshal(customerXML);
System.out.println(customer.getName());
       
    }

}