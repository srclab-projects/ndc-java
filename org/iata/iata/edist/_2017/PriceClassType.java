//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * PRICE CLASS definition.
 * 
 * <p>Java class for PriceClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType"/>
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}ClassOfService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceClassID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceClassType", propOrder = {
    "name",
    "code",
    "descriptions",
    "fareBasisCode",
    "classOfService",
    "displayOrder"
})
public class PriceClassType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "FareBasisCode")
    protected FareBasisCodeType fareBasisCode;
    @XmlElement(name = "ClassOfService")
    protected List<FlightCOSCoreType> classOfService;
    @XmlElement(name = "DisplayOrder")
    protected String displayOrder;
    @XmlAttribute(name = "PriceClassID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String priceClassID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Fare Basis Code with optional application. Example: Y26
     * 
     * @return
     *     possible object is
     *     {@link FareBasisCodeType }
     *     
     */
    public FareBasisCodeType getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasisCodeType }
     *     
     */
    public void setFareBasisCode(FareBasisCodeType value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightCOSCoreType }
     * 
     * 
     */
    public List<FlightCOSCoreType> getClassOfService() {
        if (classOfService == null) {
            classOfService = new ArrayList<FlightCOSCoreType>();
        }
        return this.classOfService;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayOrder(String value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the priceClassID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassID() {
        return priceClassID;
    }

    /**
     * Sets the value of the priceClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceClassID(String value) {
        this.priceClassID = value;
    }

}
