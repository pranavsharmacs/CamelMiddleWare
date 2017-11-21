
package org.xmlsoap.schemas.ws._2002._07.secext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2002/07/secext}Username"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2002/07/secext}Password" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "password"
})
@XmlRootElement(name = "UsernameToken")
public class UsernameToken {

    @XmlElement(name = "Username", required = true)
    protected Username username;
    @XmlElement(name = "Password")
    protected Password password;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link Username }
     *     
     */
    public Username getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link Username }
     *     
     */
    public void setUsername(Username value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link Password }
     *     
     */
    public Password getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link Password }
     *     
     */
    public void setPassword(Password value) {
        this.password = value;
    }

}
