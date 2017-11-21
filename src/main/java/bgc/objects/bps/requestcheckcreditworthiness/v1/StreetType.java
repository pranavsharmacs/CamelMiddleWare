
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}StreetIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}NameType" minOccurs="0"/&gt;
 *         &lt;element name="languageRegime" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}LanguageCodeISOAlpha2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetType", propOrder = {
    "identifier",
    "name",
    "languageRegime"
})
public class StreetType {

    protected StreetIdentifierType identifier;
    protected NameType name;
    protected LanguageCodeISOAlpha2Type languageRegime;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link StreetIdentifierType }
     *     
     */
    public StreetIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetIdentifierType }
     *     
     */
    public void setIdentifier(StreetIdentifierType value) {
        this.identifier = value;
    }

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
     * Gets the value of the languageRegime property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeISOAlpha2Type }
     *     
     */
    public LanguageCodeISOAlpha2Type getLanguageRegime() {
        return languageRegime;
    }

    /**
     * Sets the value of the languageRegime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeISOAlpha2Type }
     *     
     */
    public void setLanguageRegime(LanguageCodeISOAlpha2Type value) {
        this.languageRegime = value;
    }

}
