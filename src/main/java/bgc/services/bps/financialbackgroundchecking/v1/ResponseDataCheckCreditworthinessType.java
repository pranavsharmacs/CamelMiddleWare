
package bgc.services.bps.financialbackgroundchecking.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import bgc.objects.bps.responsecheckcreditworthiness.v1.CustomerCharValType;
import bgc.objects.bps.responsecheckcreditworthiness.v1.CustomerCreditProfileType;
import bgc.objects.bps.responsecheckcreditworthiness.v1.CustomerIdentifierType;


/**
 * <p>Java class for ResponseDataCheckCreditworthinessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDataCheckCreditworthinessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerCreditProfile" type="{urn:v1.responsecheckcreditworthiness.bps.objects.bgc}CustomerCreditProfileType" minOccurs="0"/&gt;
 *         &lt;element name="customerIdentifier" type="{urn:v1.responsecheckcreditworthiness.bps.objects.bgc}CustomerIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="customerCharVal" type="{urn:v1.responsecheckcreditworthiness.bps.objects.bgc}CustomerCharValType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataCheckCreditworthinessType", propOrder = {
    "customerCreditProfile",
    "customerIdentifier",
    "customerCharVal"
})
public class ResponseDataCheckCreditworthinessType {

    protected CustomerCreditProfileType customerCreditProfile;
    protected CustomerIdentifierType customerIdentifier;
    protected List<CustomerCharValType> customerCharVal;

    /**
     * Gets the value of the customerCreditProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditProfileType }
     *     
     */
    public CustomerCreditProfileType getCustomerCreditProfile() {
        return customerCreditProfile;
    }

    /**
     * Sets the value of the customerCreditProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditProfileType }
     *     
     */
    public void setCustomerCreditProfile(CustomerCreditProfileType value) {
        this.customerCreditProfile = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public CustomerIdentifierType getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public void setCustomerIdentifier(CustomerIdentifierType value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the customerCharVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerCharVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerCharVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerCharValType }
     * 
     * 
     */
    public List<CustomerCharValType> getCustomerCharVal() {
        if (customerCharVal == null) {
            customerCharVal = new ArrayList<CustomerCharValType>();
        }
        return this.customerCharVal;
    }

}
