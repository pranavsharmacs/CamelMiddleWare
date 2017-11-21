
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CityIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="relatedCity" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZIPCode" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}NameType" minOccurs="0"/&gt;
 *         &lt;element name="NISCode" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *         &lt;element name="languageRegime" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityType", propOrder = {
    "identifier",
    "relatedCity",
    "zipCode",
    "name",
    "nisCode",
    "languageRegime",
    "type"
})
public class CityType {

    protected CityIdentifierType identifier;
    protected List<CityType> relatedCity;
    @XmlElement(name = "ZIPCode")
    protected CodeValueType zipCode;
    protected NameType name;
    @XmlElement(name = "NISCode")
    protected CodeValueType nisCode;
    protected CodeValueType languageRegime;
    protected CodeValueType type;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link CityIdentifierType }
     *     
     */
    public CityIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityIdentifierType }
     *     
     */
    public void setIdentifier(CityIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the relatedCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityType }
     * 
     * 
     */
    public List<CityType> getRelatedCity() {
        if (relatedCity == null) {
            relatedCity = new ArrayList<CityType>();
        }
        return this.relatedCity;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getZIPCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setZIPCode(CodeValueType value) {
        this.zipCode = value;
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
     * Gets the value of the nisCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getNISCode() {
        return nisCode;
    }

    /**
     * Sets the value of the nisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setNISCode(CodeValueType value) {
        this.nisCode = value;
    }

    /**
     * Gets the value of the languageRegime property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getLanguageRegime() {
        return languageRegime;
    }

    /**
     * Sets the value of the languageRegime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setLanguageRegime(CodeValueType value) {
        this.languageRegime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setType(CodeValueType value) {
        this.type = value;
    }

}
