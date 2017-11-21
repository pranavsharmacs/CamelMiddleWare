
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeISOAlpha3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryCodeISOAlpha3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alpha3Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idScope" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryCodeISOAlpha3Type", propOrder = {
    "alpha3Code",
    "idScope"
})
public class CountryCodeISOAlpha3Type {

    @XmlElement(required = true)
    protected String alpha3Code;
    protected CodeValueType idScope;

    /**
     * Gets the value of the alpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlpha3Code() {
        return alpha3Code;
    }

    /**
     * Sets the value of the alpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlpha3Code(String value) {
        this.alpha3Code = value;
    }

    /**
     * Gets the value of the idScope property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getIdScope() {
        return idScope;
    }

    /**
     * Sets the value of the idScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setIdScope(CodeValueType value) {
        this.idScope = value;
    }

}
