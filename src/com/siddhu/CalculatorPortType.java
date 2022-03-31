
package com.siddhu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorPortType", targetNamespace = "http://c.b.a")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorPortType {


    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:add")
    @WebResult(targetNamespace = "http://c.b.a")
    @RequestWrapper(localName = "add", targetNamespace = "http://c.b.a", className = "com.siddhu.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://c.b.a", className = "com.siddhu.AddResponse")
    public Integer add(
        @WebParam(name = "n1", targetNamespace = "http://c.b.a")
        Integer n1,
        @WebParam(name = "n2", targetNamespace = "http://c.b.a")
        Integer n2);

}
