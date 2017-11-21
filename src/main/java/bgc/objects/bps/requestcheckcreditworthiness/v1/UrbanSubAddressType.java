
package bgc.objects.bps.requestcheckcreditworthiness.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanSubAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanSubAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="houseNumberFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseNumberLastSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseNumberLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="houseNumberFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}UrbanSubAddressIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="street" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}StreetType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CityType" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="charVal" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}UrbanSubAddressCharValType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZIPCode" type="{urn:v1.requestcheckcreditworthiness.bps.objects.bgc}CodeValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanSubAddressType", propOrder = {
    "houseNumberFirst",
    "houseNumberLastSuffix",
    "houseNumberLast",
    "houseNumberFirstSuffix",
    "blockNumber",
    "floorNumber",
    "apartmentNumber",
    "boxNumber",
    "identifier",
    "street",
    "city",
    "country",
    "charVal",
    "zipCode"
})
public class UrbanSubAddressType {

    protected String houseNumberFirst;
    protected String houseNumberLastSuffix;
    protected String houseNumberLast;
    protected String houseNumberFirstSuffix;
    protected String blockNumber;
    protected String floorNumber;
    protected String apartmentNumber;
    protected String boxNumber;
    protected UrbanSubAddressIdentifierType identifier;
    protected StreetType street;
    protected CityType city;
    protected CountryType country;
    protected List<UrbanSubAddressCharValType> charVal;
    @XmlElement(name = "ZIPCode")
    protected CodeValueType zipCode;

    /**
     * Gets the value of the houseNumberFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberFirst() {
        return houseNumberFirst;
    }

    /**
     * Sets the value of the houseNumberFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberFirst(String value) {
        this.houseNumberFirst = value;
    }

    /**
     * Gets the value of the houseNumberLastSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberLastSuffix() {
        return houseNumberLastSuffix;
    }

    /**
     * Sets the value of the houseNumberLastSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberLastSuffix(String value) {
        this.houseNumberLastSuffix = value;
    }

    /**
     * Gets the value of the houseNumberLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberLast() {
        return houseNumberLast;
    }

    /**
     * Sets the value of the houseNumberLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberLast(String value) {
        this.houseNumberLast = value;
    }

    /**
     * Gets the value of the houseNumberFirstSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberFirstSuffix() {
        return houseNumberFirstSuffix;
    }

    /**
     * Sets the value of the houseNumberFirstSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberFirstSuffix(String value) {
        this.houseNumberFirstSuffix = value;
    }

    /**
     * Gets the value of the blockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNumber(String value) {
        this.blockNumber = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the boxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxNumber() {
        return boxNumber;
    }

    /**
     * Sets the value of the boxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxNumber(String value) {
        this.boxNumber = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanSubAddressIdentifierType }
     *     
     */
    public UrbanSubAddressIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanSubAddressIdentifierType }
     *     
     */
    public void setIdentifier(UrbanSubAddressIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setStreet(StreetType value) {
        this.street = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the charVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrbanSubAddressCharValType }
     * 
     * 
     */
    public List<UrbanSubAddressCharValType> getCharVal() {
        if (charVal == null) {
            charVal = new ArrayList<UrbanSubAddressCharValType>();
        }
        return this.charVal;
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

}
