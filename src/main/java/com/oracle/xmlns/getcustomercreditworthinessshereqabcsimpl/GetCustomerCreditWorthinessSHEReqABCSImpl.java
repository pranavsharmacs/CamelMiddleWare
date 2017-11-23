package com.oracle.xmlns.getcustomercreditworthinessshereqabcsimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-20T15:35:32.685+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://xmlns.oracle.com/GetCustomerCreditWorthinessSHEReqABCSImpl", name = "GetCustomerCreditWorthinessSHEReqABCSImpl")
@XmlSeeAlso({com.oracle.xmlns.enterpriseobjects.core.common.v2.ObjectFactory.class, bgc.objects.vss.context.v4.ObjectFactory.class, com.siebel.xml.shequerycreditdetailsreqabm.ObjectFactory.class, com.siebel.xml.bgcsoapexception.v1.ObjectFactory.class, org.xmlsoap.schemas.ws._2002._07.secext.ObjectFactory.class, org.xmlsoap.schemas.ws._2003._03.addressing.ObjectFactory.class, com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.ObjectFactory.class, com.siebel.xml.shequerycreditdetailsresabm.ObjectFactory.class, oasis.names.tc.xacml._2_0.context.schema.cd._04.ObjectFactory.class, oasis.names.tc.xacml._2_0.policy.schema.cd._04.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetCustomerCreditWorthinessSHEReqABCSImpl {

    @WebMethod(operationName = "GetCustomerCreditWorthiness", action = "GetCustomerCreditWorthiness")
    @WebResult(name = "SHEQueryCreditDetailsResABM", targetNamespace = "http://www.siebel.com/xml/SHEQueryCreditDetailsResABM", partName = "SHEQueryCreditDetailsResABM")
    public com.siebel.xml.shequerycreditdetailsresabm.SHEQueryCreditDetailsResABM getCustomerCreditWorthiness(
        @WebParam(partName = "SHECreditworthinessRequest", name = "SHECreditworthinessRequest", targetNamespace = "http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM")
        com.siebel.xml.shequerycreditdetailsreqabm.SHEQueryCreditDetailsReqABM sheCreditworthinessRequest
    ) throws GetCustomerCreditWorthinessFaultMsg;
}