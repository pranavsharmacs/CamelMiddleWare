<?xml version = '1.0' encoding = 'UTF-8'?>
<?oracle-xsl-mapper <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="XSD">
      <schema location="oramds:/apps/AIAMetaData/AIAComponents/ApplicationObjectLibrary/Siebel/V1/schemas/BGC/CWC/SHEQueryCreditDetailsReqABM.xsd"/>
      <rootElement name="SHECreditworthinessRequest" namespace="http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="oramds:/apps/AIAMetaData/AIAComponents/EnterpriseBusinessServiceLibrary/Core/EBO/CustomerParty/V2/CustomerPartyEBS.wsdl"/>
      <rootElement name="ProcessCreditEligibilityVerificationEBM" namespace="http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/CustomerParty/V2"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 10.1.3.4.0(build 080718.0645) AT [FRI AUG 22 10:34:13 GMT 2014]. -->
?>
<xsl:stylesheet version="1.0" xmlns:ns5="http://xmlns.oracle.com/EnterpriseServices/CustomerParty/V2" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:xsdLocal="http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM" xmlns:customerpartyebo="http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/CustomerParty/V2" xmlns:aia="http://www.oracle.com/XSL/Transform/java/oracle.apps.aia.core.xpath.AIAFunctions" xmlns:ehdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.esb.server.headers.ESBHeaderFunctions" xmlns:ns4="http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/CustomerParty/V2" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:svcdoc="http://xmlns.oracle.com/Services/Documentation/V1" xmlns:ns3="http://schemas.xmlsoap.org/ws/2003/03/addressing" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:ns0="urn:oasis:names:tc:xacml:2.0:context:schema:cd:04" xmlns:ns1="http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:orcl="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:corecustomerpartyebs="http://xmlns.oracle.com/EnterpriseServices/Core/CustomerParty/V2" xmlns:ns2="urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04" xmlns:corecom="http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2" exclude-result-prefixes="xsl xsdLocal xsd ns5 customerpartyebo ns4 svcdoc ns3 soap ns0 ns1 corecustomerpartyebs ns2 corecom bpws aia ehdr hwf xp20 xref ora ids orcl" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue">
  <xsl:template match="/">
    <customerpartyebo:ProcessCreditEligibilityVerificationEBM>
      <corecom:EBMHeader>
        <corecom:EBMID>
          <!-- <xsl:value-of select="orcl:generate-guid()"/> -->
        </corecom:EBMID>
      </corecom:EBMHeader>
      <customerpartyebo:DataArea>
        <customerpartyebo:ProcessCreditEligibilityVerification>
          <corecom:Identification>
            <corecom:ID>
              <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:CDBId"/>
            </corecom:ID>
            <corecom:ApplicationObjectKey>
              <corecom:ID>
                <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:LastName"/>
              </corecom:ID>
              <corecom:ContextID>
                <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:FirstName"/>
              </corecom:ContextID>
            </corecom:ApplicationObjectKey>
            </corecom:Identification>
          <customerpartyebo:RequestDateTime>
            <!--xsl:value-of select='xp20:format-dateTime(concat(substring(/xsdLocal:SHECreditworthinessRequest/xsdLocal:Birthdate,7.0,4.0),"-",substring(/xsdLocal:SHECreditworthinessRequest/xsdLocal:Birthdate,1.0,2.0),"-",substring(/xsdLocal:SHECreditworthinessRequest/xsdLocal:Birthdate,4.0,2.0),"T00:00:00"),"[D01]/[M01]/[Y0001]")'/-->
            <xsl:value-of select="concat(/xsdLocal:SHECreditworthinessRequest/xsdLocal:Birthdate,' ')"/>
            </customerpartyebo:RequestDateTime>
          <corecom:CustomerPartyReference>
            <corecom:CustomerPartyAccountContactAddressCommunication>
              <corecom:AddressCommunication>
                <corecom:Address>
                  <corecom:LineThree>
                    <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:HouseNumber"/>
                  </corecom:LineThree>
                  <corecom:LineFour>
                    <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:HouseNumberAlpha"/>
                  </corecom:LineFour>
                  <corecom:LineFive>
                    <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:Streetname"/>
                  </corecom:LineFive>
                   <corecom:LineSix>
                    <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:Cityname"/>
                  </corecom:LineSix>
                  <corecom:PostalCode>
                    <xsl:value-of select="/xsdLocal:SHECreditworthinessRequest/xsdLocal:Zipcode"/>
                  </corecom:PostalCode>
                </corecom:Address>
              </corecom:AddressCommunication>
            </corecom:CustomerPartyAccountContactAddressCommunication>
          </corecom:CustomerPartyReference>
        </customerpartyebo:ProcessCreditEligibilityVerification>
      </customerpartyebo:DataArea>
    </customerpartyebo:ProcessCreditEligibilityVerificationEBM>
  </xsl:template>
</xsl:stylesheet>
