
package com.oracle.xmlns.getcustomercreditworthinessshereqabcsimpl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-20T15:35:32.628+01:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "BGCException", targetNamespace = "http://www.siebel.com/xml/BGCSoapException/V1")
public class GetCustomerCreditWorthinessFaultMsg extends Exception {
    
    private com.siebel.xml.bgcsoapexception.v1.BGCException bgcException;

    public GetCustomerCreditWorthinessFaultMsg() {
        super();
    }
    
    public GetCustomerCreditWorthinessFaultMsg(String message) {
        super(message);
    }
    
    public GetCustomerCreditWorthinessFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCustomerCreditWorthinessFaultMsg(String message, com.siebel.xml.bgcsoapexception.v1.BGCException bgcException) {
        super(message);
        this.bgcException = bgcException;
    }

    public GetCustomerCreditWorthinessFaultMsg(String message, com.siebel.xml.bgcsoapexception.v1.BGCException bgcException, Throwable cause) {
        super(message, cause);
        this.bgcException = bgcException;
    }

    public com.siebel.xml.bgcsoapexception.v1.BGCException getFaultInfo() {
        return this.bgcException;
    }
}
