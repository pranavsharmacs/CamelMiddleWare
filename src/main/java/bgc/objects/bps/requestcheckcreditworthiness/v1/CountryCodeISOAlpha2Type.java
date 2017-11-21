
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeISOAlpha2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryCodeISOAlpha2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alpha2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CountryCodeISOAlpha2Type", propOrder = {
    "alpha2Code",
    "idScope"
})
public class CountryCodeISOAlpha2Type {

    protected String alpha2Code;
    protected CodeValueType idScope;

    /**
     * Gets the value of the alpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlpha2Code() {
        return alpha2Code;
    }

    /**
     * Sets the value of the alpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlpha2Code(String value) {
        this.alpha2Code = value;
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
