
package bgc.services.bps.financialbackgroundchecking.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDataCheckCreditworthinessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDataCheckCreditworthinessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionData" type="{urn:v1.financialbackgroundchecking.bps.services.bgc}TransactionDataType"/&gt;
 *         &lt;element name="criteria" type="{urn:v1.financialbackgroundchecking.bps.services.bgc}CriteriaCheckType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataCheckCreditworthinessType", propOrder = {
    "transactionData",
    "criteria"
})
public class RequestDataCheckCreditworthinessType {

    @XmlElement(required = true)
    protected TransactionDataType transactionData;
    @XmlElement(required = true)
    protected CriteriaCheckType criteria;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDataType }
     *     
     */
    public TransactionDataType getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDataType }
     *     
     */
    public void setTransactionData(TransactionDataType value) {
        this.transactionData = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaCheckType }
     *     
     */
    public CriteriaCheckType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaCheckType }
     *     
     */
    public void setCriteria(CriteriaCheckType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
