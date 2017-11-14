
package bgc.services.aia.customerconsultation.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import bgc.objects.aia.responsegetcustomermigrationstatus.v1.CustomerCharValType;


/**
 * <p>Java class for ResponseDataGetCustomerMigrationStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDataGetCustomerMigrationStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerCharVal" type="{urn:v1.responsegetcustomermigrationstatus.aia.objects.bgc}CustomerCharValType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataGetCustomerMigrationStatusType", propOrder = {
    "customerCharVal"
})
public class ResponseDataGetCustomerMigrationStatusType {

    @XmlElement(required = true)
    protected List<CustomerCharValType> customerCharVal;

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
