
package com.oracle.xmlns.enterpriseobjects.core.custom.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.common.v2.TextType;


/**
 * <p>Java class for CustomIntermediateMessageHopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomIntermediateMessageHopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Originator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomIntermediateMessageHopType", propOrder = {
    "correlationID",
    "originator"
})
public class CustomIntermediateMessageHopType {

    @XmlElement(name = "CorrelationID", required = true)
    protected String correlationID;
    @XmlElement(name = "Originator", required = true)
    protected TextType originator;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOriginator(TextType value) {
        this.originator = value;
    }

}
