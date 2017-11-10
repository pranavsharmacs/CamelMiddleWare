
package com.siebel.customui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.bgcsoapexception.v1.BGCException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siebel.com/xml/BGCSoapException/V1}BGCException"/&gt;
 *         &lt;element name="Customer_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Migration_spcStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Process_spcInstance_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bgcException",
    "customerSpcId",
    "migrationSpcStatus",
    "processSpcInstanceSpcId"
})
@XmlRootElement(name = "BGCCustomerConsultationgetCustomerMigrationStatus_2_Output")
public class BGCCustomerConsultationgetCustomerMigrationStatus2Output {

    @XmlElement(name = "BGCException", namespace = "http://www.siebel.com/xml/BGCSoapException/V1", required = true)
    protected BGCException bgcException;
    @XmlElement(name = "Customer_spcId", required = true)
    protected String customerSpcId;
    @XmlElement(name = "Migration_spcStatus", required = true)
    protected String migrationSpcStatus;
    @XmlElement(name = "Process_spcInstance_spcId", required = true)
    protected String processSpcInstanceSpcId;

    /**
     * Gets the value of the bgcException property.
     * 
     * @return
     *     possible object is
     *     {@link BGCException }
     *     
     */
    public BGCException getBGCException() {
        return bgcException;
    }

    /**
     * Sets the value of the bgcException property.
     * 
     * @param value
     *     allowed object is
     *     {@link BGCException }
     *     
     */
    public void setBGCException(BGCException value) {
        this.bgcException = value;
    }

    /**
     * Gets the value of the customerSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSpcId() {
        return customerSpcId;
    }

    /**
     * Sets the value of the customerSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSpcId(String value) {
        this.customerSpcId = value;
    }

    /**
     * Gets the value of the migrationSpcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationSpcStatus() {
        return migrationSpcStatus;
    }

    /**
     * Sets the value of the migrationSpcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationSpcStatus(String value) {
        this.migrationSpcStatus = value;
    }

    /**
     * Gets the value of the processSpcInstanceSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessSpcInstanceSpcId() {
        return processSpcInstanceSpcId;
    }

    /**
     * Sets the value of the processSpcInstanceSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessSpcInstanceSpcId(String value) {
        this.processSpcInstanceSpcId = value;
    }

}
