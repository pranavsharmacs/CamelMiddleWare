package bgc.services.aia.customerconsultation.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-09T15:26:49.869+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "urn:v1.customerconsultation.aia.services.bgc", name = "CustomerConsultationPortType")
@XmlSeeAlso({bgc.objects.vss.checkservice.v1.ObjectFactory.class, bgc.objects.vss.context.v4.ObjectFactory.class, bgc.objects.aia.requestgetcustomermigrationstatus.v1.ObjectFactory.class, bgc.objects.vss.functionalerror.v1.ObjectFactory.class, ObjectFactory.class, bgc.objects.aia.responsegetcustomermigrationstatus.v1.ObjectFactory.class, bgc.objects.vss.technicalerror.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerConsultationPortType {

    @WebMethod(operationName = "CheckService", action = "CheckService")
    @WebResult(name = "ResponseDataCheckService", targetNamespace = "urn:v1.customerconsultation.aia.services.bgc", partName = "CheckServiceResponseMessagePart")
    public bgc.objects.vss.checkservice.v1.ResponseDataCheckServiceType checkService(
        @WebParam(partName = "CheckServiceRequestMessagePart", name = "RequestDataCheckService", targetNamespace = "urn:v1.customerconsultation.aia.services.bgc")
        bgc.objects.vss.checkservice.v1.RequestDataCheckServiceType checkServiceRequestMessagePart
    ) throws FunctionalFaultMessage, TechnicalFaultMessage;

    @WebMethod(operationName = "GetCustomerMigrationStatus", action = "GetCustomerMigrationStatus")
    @WebResult(name = "ResponseDataGetCustomerMigrationStatus", targetNamespace = "urn:v1.customerconsultation.aia.services.bgc", partName = "GetCustomerMigrationStatusResponseMessagePart")
    public ResponseDataGetCustomerMigrationStatusType getCustomerMigrationStatus(
        @WebParam(partName = "GetCustomerMigrationStatusRequestMessagePart", name = "RequestDataGetCustomerMigrationStatus", targetNamespace = "urn:v1.customerconsultation.aia.services.bgc")
        RequestDataGetCustomerMigrationStatusType getCustomerMigrationStatusRequestMessagePart
    ) throws FunctionalFaultMessage, TechnicalFaultMessage;
}
