
package com.siebel.xml.bgcsoapexception.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BGCExceptionTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BGCExceptionTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BGCException" type="{http://www.siebel.com/xml/BGCSoapException/V1}BGCException"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BGCExceptionTopElmt", propOrder = {
    "bgcException"
})
public class BGCExceptionTopElmt {

    @XmlElement(name = "BGCException", required = true)
    protected BGCException bgcException;

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

}
