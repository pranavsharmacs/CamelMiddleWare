
package bgc.services.bps.financialbackgroundchecking.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import bgc.objects.bps.requestcheckcreditworthiness.v1.CustomerIdentifierType;
import bgc.objects.bps.requestcheckcreditworthiness.v1.PersonType;
import bgc.objects.bps.requestcheckcreditworthiness.v1.VATNumberType;


/**
 * <p>Java class for CriteriaCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaCheckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="customerIdentifier" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CustomerIdentifierType"/&gt;
 *         &lt;element name="VATNumber" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}VATNumberType"/&gt;
 *         &lt;element name="person" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}PersonType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaCheckType", propOrder = {
    "customerIdentifier",
    "vatNumber",
    "person"
})
public class CriteriaCheckType {

    protected CustomerIdentifierType customerIdentifier;
    @XmlElement(name = "VATNumber")
    protected VATNumberType vatNumber;
    protected PersonType person;

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
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link VATNumberType }
     *     
     */
    public VATNumberType getVATNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATNumberType }
     *     
     */
    public void setVATNumber(VATNumberType value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

}
