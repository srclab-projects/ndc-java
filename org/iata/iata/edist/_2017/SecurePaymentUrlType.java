//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SECURE PAYMENT URL definition.
 * A data type for Airline and 3DS Merchant URL(s).
 * 
 * <p>Java class for SecurePaymentUrlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentUrlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACS_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="FailURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MerchantURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="TermURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentUrlType", propOrder = {
    "acsurl",
    "failURL",
    "merchantURL",
    "termURL"
})
@XmlSeeAlso({
    org.iata.iata.edist._2017.SecurePaymentAlertType.URLs.class
})
public class SecurePaymentUrlType {

    @XmlElement(name = "ACS_URL")
    @XmlSchemaType(name = "anyURI")
    protected String acsurl;
    @XmlElement(name = "FailURL")
    @XmlSchemaType(name = "anyURI")
    protected String failURL;
    @XmlElement(name = "MerchantURL")
    @XmlSchemaType(name = "anyURI")
    protected String merchantURL;
    @XmlElement(name = "TermURL")
    @XmlSchemaType(name = "anyURI")
    protected String termURL;

    /**
     * Gets the value of the acsurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSURL() {
        return acsurl;
    }

    /**
     * Sets the value of the acsurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSURL(String value) {
        this.acsurl = value;
    }

    /**
     * Gets the value of the failURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailURL() {
        return failURL;
    }

    /**
     * Sets the value of the failURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailURL(String value) {
        this.failURL = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantURL(String value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the termURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermURL() {
        return termURL;
    }

    /**
     * Sets the value of the termURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermURL(String value) {
        this.termURL = value;
    }

}
