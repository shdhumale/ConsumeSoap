/**
 * 
 */
package com.siddhu;

import javax.xml.ws.WebServiceRef;

/**
 * @author Siddhartha
 *
 */
public class SiddhuMain {
	    public static void main(String[] args) {
	        try {
	        	SiddhuMain client = new SiddhuMain();
	            client.doTest();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void doTest() {
	        try {
	        	Calculator objCalculator =  new Calculator();
	            System.out.println("Retrieving the port fromthe following service: " + objCalculator);
	            CalculatorPortType port = objCalculator.getCalculatorHttpSoap11Endpoint();
	            System.out.println("Invoking the add method the port.");
	            Integer response = port.add(new Integer("1"),new Integer("2"));
	            System.out.println(response.toString());
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
}
