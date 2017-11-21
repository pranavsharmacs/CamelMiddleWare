
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}NameType"/&gt;
 *         &lt;element name="codeISO3" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CountryCodeISOAlpha3Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "name",
    "codeISO3"
})
public class CountryType {

    @XmlElement(required = true)
    protected NameType name;
    protected List<CountryCodeISOAlpha3Type> codeISO3;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the codeISO3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeISO3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeISO3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeISOAlpha3Type }
     * 
     * 
     */
    public List<CountryCodeISOAlpha3Type> getCodeISO3() {
        if (codeISO3 == null) {
            codeISO3 = new ArrayList<CountryCodeISOAlpha3Type>();
        }
        return this.codeISO3;
    }

}
