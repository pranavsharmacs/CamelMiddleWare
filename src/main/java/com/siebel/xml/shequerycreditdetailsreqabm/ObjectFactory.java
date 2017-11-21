
package com.siebel.xml.shequerycreditdetailsreqabm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.shequerycreditdetailsreqabm package. 
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

    private final static QName _SHECreditworthinessRequest_QNAME = new QName("http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM", "SHECreditworthinessRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.shequerycreditdetailsreqabm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SHEQueryCreditDetailsReqABM }
     * 
     */
    public SHEQueryCreditDetailsReqABM createSHEQueryCreditDetailsReqABM() {
        return new SHEQueryCreditDetailsReqABM();
    }

    /**
     * Create an instance of {@link SHEQueryCreditDetailsReqABMTopElmt }
     * 
     */
    public SHEQueryCreditDetailsReqABMTopElmt createSHEQueryCreditDetailsReqABMTopElmt() {
        return new SHEQueryCreditDetailsReqABMTopElmt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHEQueryCreditDetailsReqABM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM", name = "SHECreditworthinessRequest")
    public JAXBElement<SHEQueryCreditDetailsReqABM> createSHECreditworthinessRequest(SHEQueryCreditDetailsReqABM value) {
        return new JAXBElement<SHEQueryCreditDetailsReqABM>(_SHECreditworthinessRequest_QNAME, SHEQueryCreditDetailsReqABM.class, null, value);
    }

}
