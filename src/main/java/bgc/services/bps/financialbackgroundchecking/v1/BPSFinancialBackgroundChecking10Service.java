package bgc.services.bps.financialbackgroundchecking.v1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-20T17:58:05.194+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "BPS-FinancialBackgroundChecking-1.0-Service", 
                  wsdlLocation = "/wsdl/CheckCreditworthinessBPS/BPS-SVC-FinancialBackgroundChecking-1.0-standard-http_binding.wsdl",
                  targetNamespace = "urn:v1.financialbackgroundchecking.bps.services.bgc") 
public class BPSFinancialBackgroundChecking10Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "BPS-FinancialBackgroundChecking-1.0-Service");
    public final static QName BPSFinancialBackgroundChecking10SOAPPort = new QName("urn:v1.financialbackgroundchecking.bps.services.bgc", "BPS-FinancialBackgroundChecking-1.0-SOAP-Port");
    static {
        URL url = BPSFinancialBackgroundChecking10Service.class.getResource("/wsdl/CheckCreditworthinessBPS/BPS-SVC-FinancialBackgroundChecking-1.0-standard-http_binding.wsdl");
        if (url == null) {
            url = BPSFinancialBackgroundChecking10Service.class.getClassLoader().getResource("/wsdl/CheckCreditworthinessBPS/BPS-SVC-FinancialBackgroundChecking-1.0-standard-http_binding.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(BPSFinancialBackgroundChecking10Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/wsdl/CheckCreditworthinessBPS/BPS-SVC-FinancialBackgroundChecking-1.0-standard-http_binding.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public BPSFinancialBackgroundChecking10Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BPSFinancialBackgroundChecking10Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BPSFinancialBackgroundChecking10Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BPSFinancialBackgroundChecking10Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BPSFinancialBackgroundChecking10Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BPSFinancialBackgroundChecking10Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns FinancialBackgroundCheckingPortType
     */
    @WebEndpoint(name = "BPS-FinancialBackgroundChecking-1.0-SOAP-Port")
    public FinancialBackgroundCheckingPortType getBPSFinancialBackgroundChecking10SOAPPort() {
        return super.getPort(BPSFinancialBackgroundChecking10SOAPPort, FinancialBackgroundCheckingPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FinancialBackgroundCheckingPortType
     */
    @WebEndpoint(name = "BPS-FinancialBackgroundChecking-1.0-SOAP-Port")
    public FinancialBackgroundCheckingPortType getBPSFinancialBackgroundChecking10SOAPPort(WebServiceFeature... features) {
        return super.getPort(BPSFinancialBackgroundChecking10SOAPPort, FinancialBackgroundCheckingPortType.class, features);
    }

}