<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="WSDL">
      <schema location="oramds:/apps/AIAMetaData/AIAComponents/ApplicationObjectLibrary/Siebel/V1/wsdls/BGC_spcCustomer_spcConsultation.wsdl"/>
      <rootElement name="BGCCustomerConsultationgetCustomerMigrationStatus_2_Output" namespace="http://siebel.com/CustomUI"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="oramds:/apps/AIAMetaData/AIAComponents/ApplicationConnectorServiceLibrary/Siebel/V1/ProviderABCS/BGC/GetCustomerMigrationStatusSHEProvABCSImpl.wsdl"/>
      <rootElement name="QueryCustomerPartyResponseEBM" namespace="http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/CustomerParty/V2"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.7.0(build 130301.0647.0008) AT [MON OCT 12 09:06:16 CEST 2015]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:client="http://xmlns.oracle.com/CRC09_Dev/GetCustomerMigrationStatusSHEProvABCSImpl/GetCustomerMigrationStatusSHEProvABCSImpl"
                xmlns:aia="http://www.oracle.com/XSL/Transform/java/oracle.apps.aia.core.xpath.AIAFunctions"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:vss="urn:v4.context.vss.objects.bgc"
                xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions"
                xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/"
                xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                xmlns:ns2="http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:tns="http://siebel.com/CustomUI"
                xmlns:ns1="http://schemas.xmlsoap.org/ws/2003/03/addressing"
                xmlns:xsdLocal1="http://www.siebel.com/xml/BGCSoapException/V1"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:ns4="urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:ns0="http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/CustomerParty/V2"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:meta="http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2"
                xmlns:ns3="urn:oasis:names:tc:xacml:2.0:context:schema:cd:04"
                xmlns:ebo="http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/CustomerParty/V2"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl soapenc soap tns xsdLocal1 xsd client vss plnk ns2 wsdl ns1 ns4 ns0 meta ns3 ebo aia bpws xp20 bpel bpm ora socket mhdr oraext dvm hwf med ids xdk xref ldap">
  <xsl:template match="/">
    <ebo:QueryCustomerPartyResponseEBM>
      <ebo:DataArea>
        <ebo:QueryCustomerPartyResponse>
          <meta:Identification>
            <meta:ID>
              <xsl:value-of select="/tns:BGCCustomerConsultationgetCustomerMigrationStatus_2_Output/tns:Customer_spcId"/>
            </meta:ID>
            <meta:ContextID>
              <xsl:value-of select="/tns:BGCCustomerConsultationgetCustomerMigrationStatus_2_Output/tns:Migration_spcStatus"/>
            </meta:ContextID>
          </meta:Identification>
        </ebo:QueryCustomerPartyResponse>
      </ebo:DataArea>
    </ebo:QueryCustomerPartyResponseEBM>
  </xsl:template>
</xsl:stylesheet>
