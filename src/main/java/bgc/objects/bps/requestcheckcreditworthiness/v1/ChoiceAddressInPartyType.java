
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChoiceAddressInPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChoiceAddressInPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="urbanSubAddress" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}UrbanSubAddressType" minOccurs="0"/&gt;
 *         &lt;element name="urbanAddress" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}UrbanAddressType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceAddressInPartyType", propOrder = {
    "urbanSubAddress",
    "urbanAddress"
})
public class ChoiceAddressInPartyType {

    protected UrbanSubAddressType urbanSubAddress;
    protected UrbanAddressType urbanAddress;

    /**
     * Gets the value of the urbanSubAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanSubAddressType }
     *     
     */
    public UrbanSubAddressType getUrbanSubAddress() {
        return urbanSubAddress;
    }

    /**
     * Sets the value of the urbanSubAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanSubAddressType }
     *     
     */
    public void setUrbanSubAddress(UrbanSubAddressType value) {
        this.urbanSubAddress = value;
    }

    /**
     * Gets the value of the urbanAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanAddressType }
     *     
     */
    public UrbanAddressType getUrbanAddress() {
        return urbanAddress;
    }

    /**
     * Sets the value of the urbanAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanAddressType }
     *     
     */
    public void setUrbanAddress(UrbanAddressType value) {
        this.urbanAddress = value;
    }

}
