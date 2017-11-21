
package com.siebel.xml.shequerycreditdetailsresabm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SHEQueryCreditDetailsResABM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHEQueryCreditDetailsResABM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WegenerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHEQueryCreditDetailsResABM", propOrder = {
    "color",
    "reason",
    "msgNo",
    "creditTimestamp",
    "wegenerId",
    "source"
})
public class SHEQueryCreditDetailsResABM {

    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "MsgNo")
    protected String msgNo;
    @XmlElement(name = "CreditTimestamp")
    protected String creditTimestamp;
    @XmlElement(name = "WegenerId")
    protected String wegenerId;
    protected String source;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the msgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNo() {
        return msgNo;
    }

    /**
     * Sets the value of the msgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNo(String value) {
        this.msgNo = value;
    }

    /**
     * Gets the value of the creditTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTimestamp() {
        return creditTimestamp;
    }

    /**
     * Sets the value of the creditTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTimestamp(String value) {
        this.creditTimestamp = value;
    }

    /**
     * Gets the value of the wegenerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWegenerId() {
        return wegenerId;
    }

    /**
     * Sets the value of the wegenerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWegenerId(String value) {
        this.wegenerId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
