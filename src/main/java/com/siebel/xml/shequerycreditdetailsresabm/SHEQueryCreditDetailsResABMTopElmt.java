
package com.siebel.xml.shequerycreditdetailsresabm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SHEQueryCreditDetailsResABMTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHEQueryCreditDetailsResABMTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SHEQueryCreditDetailsResABM" type="{http://www.siebel.com/xml/SHEQueryCreditDetailsResABM}SHEQueryCreditDetailsResABM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHEQueryCreditDetailsResABMTopElmt", propOrder = {
    "sheQueryCreditDetailsResABM"
})
public class SHEQueryCreditDetailsResABMTopElmt {

    @XmlElement(name = "SHEQueryCreditDetailsResABM", required = true)
    protected SHEQueryCreditDetailsResABM sheQueryCreditDetailsResABM;

    /**
     * Gets the value of the sheQueryCreditDetailsResABM property.
     * 
     * @return
     *     possible object is
     *     {@link SHEQueryCreditDetailsResABM }
     *     
     */
    public SHEQueryCreditDetailsResABM getSHEQueryCreditDetailsResABM() {
        return sheQueryCreditDetailsResABM;
    }

    /**
     * Sets the value of the sheQueryCreditDetailsResABM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHEQueryCreditDetailsResABM }
     *     
     */
    public void setSHEQueryCreditDetailsResABM(SHEQueryCreditDetailsResABM value) {
        this.sheQueryCreditDetailsResABM = value;
    }

}
