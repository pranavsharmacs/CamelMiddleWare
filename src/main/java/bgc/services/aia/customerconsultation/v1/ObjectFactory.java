
package bgc.services.aia.customerconsultation.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import bgc.objects.vss.checkservice.v1.RequestDataCheckServiceType;
import bgc.objects.vss.checkservice.v1.ResponseDataCheckServiceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bgc.services.aia.customerconsultation.v1 package. 
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

    private final static QName _RequestDataGetCustomerMigrationStatus_QNAME = new QName("urn:v1.customerconsultation.aia.services.bgc", "RequestDataGetCustomerMigrationStatus");
    private final static QName _ResponseDataGetCustomerMigrationStatus_QNAME = new QName("urn:v1.customerconsultation.aia.services.bgc", "ResponseDataGetCustomerMigrationStatus");
    private final static QName _RequestDataCheckService_QNAME = new QName("urn:v1.customerconsultation.aia.services.bgc", "RequestDataCheckService");
    private final static QName _ResponseDataCheckService_QNAME = new QName("urn:v1.customerconsultation.aia.services.bgc", "ResponseDataCheckService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bgc.services.aia.customerconsultation.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestDataGetCustomerMigrationStatusType }
     * 
     */
    public RequestDataGetCustomerMigrationStatusType createRequestDataGetCustomerMigrationStatusType() {
        return new RequestDataGetCustomerMigrationStatusType();
    }

    /**
     * Create an instance of {@link ResponseDataGetCustomerMigrationStatusType }
     * 
     */
    public ResponseDataGetCustomerMigrationStatusType createResponseDataGetCustomerMigrationStatusType() {
        return new ResponseDataGetCustomerMigrationStatusType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDataGetCustomerMigrationStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.customerconsultation.aia.services.bgc", name = "RequestDataGetCustomerMigrationStatus")
    public JAXBElement<RequestDataGetCustomerMigrationStatusType> createRequestDataGetCustomerMigrationStatus(RequestDataGetCustomerMigrationStatusType value) {
        return new JAXBElement<RequestDataGetCustomerMigrationStatusType>(_RequestDataGetCustomerMigrationStatus_QNAME, RequestDataGetCustomerMigrationStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDataGetCustomerMigrationStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.customerconsultation.aia.services.bgc", name = "ResponseDataGetCustomerMigrationStatus")
    public JAXBElement<ResponseDataGetCustomerMigrationStatusType> createResponseDataGetCustomerMigrationStatus(ResponseDataGetCustomerMigrationStatusType value) {
        return new JAXBElement<ResponseDataGetCustomerMigrationStatusType>(_ResponseDataGetCustomerMigrationStatus_QNAME, ResponseDataGetCustomerMigrationStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDataCheckServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.customerconsultation.aia.services.bgc", name = "RequestDataCheckService")
    public JAXBElement<RequestDataCheckServiceType> createRequestDataCheckService(RequestDataCheckServiceType value) {
        return new JAXBElement<RequestDataCheckServiceType>(_RequestDataCheckService_QNAME, RequestDataCheckServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDataCheckServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:v1.customerconsultation.aia.services.bgc", name = "ResponseDataCheckService")
    public JAXBElement<ResponseDataCheckServiceType> createResponseDataCheckService(ResponseDataCheckServiceType value) {
        return new JAXBElement<ResponseDataCheckServiceType>(_ResponseDataCheckService_QNAME, ResponseDataCheckServiceType.class, null, value);
    }

}
