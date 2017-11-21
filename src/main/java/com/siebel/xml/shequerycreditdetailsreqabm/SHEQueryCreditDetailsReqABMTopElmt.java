
package com.siebel.xml.shequerycreditdetailsreqabm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SHEQueryCreditDetailsReqABMTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHEQueryCreditDetailsReqABMTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SHEQueryCreditDetailsReqABM" type="{http://www.siebel.com/xml/SHEQueryCreditDetailsReqABM}SHEQueryCreditDetailsReqABM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHEQueryCreditDetailsReqABMTopElmt", propOrder = {
    "sheQueryCreditDetailsReqABM"
})
public class SHEQueryCreditDetailsReqABMTopElmt {

    @XmlElement(name = "SHEQueryCreditDetailsReqABM", required = true)
    protected SHEQueryCreditDetailsReqABM sheQueryCreditDetailsReqABM;

    /**
     * Gets the value of the sheQueryCreditDetailsReqABM property.
     * 
     * @return
     *     possible object is
     *     {@link SHEQueryCreditDetailsReqABM }
     *     
     */
    public SHEQueryCreditDetailsReqABM getSHEQueryCreditDetailsReqABM() {
        return sheQueryCreditDetailsReqABM;
    }

    /**
     * Sets the value of the sheQueryCreditDetailsReqABM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHEQueryCreditDetailsReqABM }
     *     
     */
    public void setSHEQueryCreditDetailsReqABM(SHEQueryCreditDetailsReqABM value) {
        this.sheQueryCreditDetailsReqABM = value;
    }

}
