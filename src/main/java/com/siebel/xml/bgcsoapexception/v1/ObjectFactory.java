
package com.siebel.xml.bgcsoapexception.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.bgcsoapexception.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BGCException_QNAME = new QName("http://www.siebel.com/xml/BGCSoapException/V1", "BGCException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.bgcsoapexception.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BGCException }
     * 
     */
    public BGCException createBGCException() {
        return new BGCException();
    }

    /**
     * Create an instance of {@link BGCExceptionTopElmt }
     * 
     */
    public BGCExceptionTopElmt createBGCExceptionTopElmt() {
        return new BGCExceptionTopElmt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BGCException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/BGCSoapException/V1", name = "BGCException")
    public JAXBElement<BGCException> createBGCException(BGCException value) {
        return new JAXBElement<BGCException>(_BGCException_QNAME, BGCException.class, null, value);
    }

}
