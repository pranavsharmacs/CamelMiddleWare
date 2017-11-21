
package bgc.services.bps.financialbackgroundchecking.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import bgc.objects.vss.checkservice.v1.RequestDataCheckServiceType;
import bgc.objects.vss.checkservice.v1.ResponseDataCheckServiceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bgc.services.bps.financialbackgroundchecking.v1 package. 
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

    private final static QName _RequestDataCheckCreditworthiness_QNAME = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "RequestDataCheckCreditworthiness");
    private final static QName _ResponseDataCheckCreditworthiness_QNAME = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "ResponseDataCheckCreditworthiness");
    private final static QName _RequestDataCheckService_QNAME = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "RequestDataCheckService");
    private final static QName _ResponseDataCheckService_QNAME = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "ResponseDataCheckService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bgc.services.bps.financialbackgroundchecking.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestDataCheckCreditworthinessType }
     * 
     */
    public RequestDataCheckCreditworthinessType createRequestDataCheckCreditworthinessType() {
        return new RequestDataCheckCreditworthinessType();
    }

    /**
     * Create an instance of {@link ResponseDataCheckCreditworthinessType }
     * 
     */
    public ResponseDataCheckCreditworthinessType createResponseDataCheckCreditworthinessType() {
        return new ResponseDataCheckCreditworthinessType();
    }

    /**
     * Create an instance of {@link TransactionDataType }
     * 
     */
    public TransactionDataType createTransactionDataType() {
        return new TransactionDataType();
    }

    /**
     * Create an instance of {@link UserContextType }
     * 
     */
    public UserContextType createUserContextType() {
        return new UserContextType();
    }

    /**
     * Create an instance of {@link CriteriaCheckType }
     * 
     */
    public CriteriaCheckType createCriteriaCheckType() {
        return new CriteriaCheckType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDataCheckCreditworthinessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.financialbackgroundchecking.bps.services.bgc", name = "RequestDataCheckCreditworthiness")
    public JAXBElement<RequestDataCheckCreditworthinessType> createRequestDataCheckCreditworthiness(RequestDataCheckCreditworthinessType value) {
        return new JAXBElement<RequestDataCheckCreditworthinessType>(_RequestDataCheckCreditworthiness_QNAME, RequestDataCheckCreditworthinessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDataCheckCreditworthinessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.financialbackgroundchecking.bps.services.bgc", name = "ResponseDataCheckCreditworthiness")
    public JAXBElement<ResponseDataCheckCreditworthinessType> createResponseDataCheckCreditworthiness(ResponseDataCheckCreditworthinessType value) {
        return new JAXBElement<ResponseDataCheckCreditworthinessType>(_ResponseDataCheckCreditworthiness_QNAME, ResponseDataCheckCreditworthinessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDataCheckServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.financialbackgroundchecking.bps.services.bgc", name = "RequestDataCheckService")
    public JAXBElement<RequestDataCheckServiceType> createRequestDataCheckService(RequestDataCheckServiceType value) {
        return new JAXBElement<RequestDataCheckServiceType>(_RequestDataCheckService_QNAME, RequestDataCheckServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDataCheckServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.financialbackgroundchecking.bps.services.bgc", name = "ResponseDataCheckService")
    public JAXBElement<ResponseDataCheckServiceType> createResponseDataCheckService(ResponseDataCheckServiceType value) {
        return new JAXBElement<ResponseDataCheckServiceType>(_ResponseDataCheckService_QNAME, ResponseDataCheckServiceType.class, null, value);
    }

}
