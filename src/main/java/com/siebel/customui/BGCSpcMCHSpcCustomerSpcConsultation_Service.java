package com.siebel.customui;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-14T16:26:18.022+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "BGC_spcMCH_spcCustomer_spcConsultation", 
                  wsdlLocation = "/wsdl/CustomerConsultationSHE/SHE.wsdl",
                  targetNamespace = "http://siebel.com/CustomUI") 
public class BGCSpcMCHSpcCustomerSpcConsultation_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/CustomUI", "BGC_spcMCH_spcCustomer_spcConsultation");
    public final static QName BGCSpcMCHSpcCustomerSpcConsultation = new QName("http://siebel.com/CustomUI", "BGC_spcMCH_spcCustomer_spcConsultation");
    static {
        URL url = BGCSpcMCHSpcCustomerSpcConsultation_Service.class.getResource("/wsdl/CustomerConsultationSHE/SHE.wsdl");
        if (url == null) {
            url = BGCSpcMCHSpcCustomerSpcConsultation_Service.class.getClassLoader().getResource("/wsdl/CustomerConsultationSHE/SHE.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(BGCSpcMCHSpcCustomerSpcConsultation_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/wsdl/CustomerConsultationSHE/SHE.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public BGCSpcMCHSpcCustomerSpcConsultation_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BGCSpcMCHSpcCustomerSpcConsultation_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BGCSpcMCHSpcCustomerSpcConsultation_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BGCSpcMCHSpcCustomerSpcConsultation_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BGCSpcMCHSpcCustomerSpcConsultation_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BGCSpcMCHSpcCustomerSpcConsultation_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BGCSpcMCHSpcCustomerSpcConsultation
     */
    @WebEndpoint(name = "BGC_spcMCH_spcCustomer_spcConsultation")
    public BGCSpcMCHSpcCustomerSpcConsultation getBGCSpcMCHSpcCustomerSpcConsultation() {
        return super.getPort(BGCSpcMCHSpcCustomerSpcConsultation, BGCSpcMCHSpcCustomerSpcConsultation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BGCSpcMCHSpcCustomerSpcConsultation
     */
    @WebEndpoint(name = "BGC_spcMCH_spcCustomer_spcConsultation")
    public BGCSpcMCHSpcCustomerSpcConsultation getBGCSpcMCHSpcCustomerSpcConsultation(WebServiceFeature... features) {
        return super.getPort(BGCSpcMCHSpcCustomerSpcConsultation, BGCSpcMCHSpcCustomerSpcConsultation.class, features);
    }

}
