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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * PARTNER ROLE: FULFILLMENT PARTNER, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from PartnerCoreRepType.
 * 
 * <p>Java class for FulfillmentPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentPartnerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}PartnerCoreRepType">
 *       &lt;sequence>
 *         &lt;element name="Fulfillments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fulfillment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferValidDates" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Start" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="End" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Location" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}StructuredAddress"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentPartnerType", propOrder = {
    "fulfillments"
})
public class FulfillmentPartnerType
    extends PartnerCoreRepType
{

    @XmlElement(name = "Fulfillments")
    protected FulfillmentPartnerType.Fulfillments fulfillments;

    /**
     * Gets the value of the fulfillments property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentPartnerType.Fulfillments }
     *     
     */
    public FulfillmentPartnerType.Fulfillments getFulfillments() {
        return fulfillments;
    }

    /**
     * Sets the value of the fulfillments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentPartnerType.Fulfillments }
     *     
     */
    public void setFulfillments(FulfillmentPartnerType.Fulfillments value) {
        this.fulfillments = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Fulfillment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferValidDates" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Start" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="End" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Location" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}StructuredAddress"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fulfillment"
    })
    public static class Fulfillments {

        @XmlElement(name = "Fulfillment", required = true)
        protected List<FulfillmentPartnerType.Fulfillments.Fulfillment> fulfillment;

        /**
         * Gets the value of the fulfillment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fulfillment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFulfillment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FulfillmentPartnerType.Fulfillments.Fulfillment }
         * 
         * 
         */
        public List<FulfillmentPartnerType.Fulfillments.Fulfillment> getFulfillment() {
            if (fulfillment == null) {
                fulfillment = new ArrayList<FulfillmentPartnerType.Fulfillments.Fulfillment>();
            }
            return this.fulfillment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OfferValidDates" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Start" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="End" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Location" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}StructuredAddress"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "offerValidDates",
            "location"
        })
        public static class Fulfillment {

            @XmlElement(name = "OfferValidDates")
            protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates offerValidDates;
            @XmlElement(name = "Location")
            protected FulfillmentPartnerType.Fulfillments.Fulfillment.Location location;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the offerValidDates property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
             *     
             */
            public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates getOfferValidDates() {
                return offerValidDates;
            }

            /**
             * Sets the value of the offerValidDates property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
             *     
             */
            public void setOfferValidDates(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates value) {
                this.offerValidDates = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
             *     
             */
            public FulfillmentPartnerType.Fulfillments.Fulfillment.Location getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
             *     
             */
            public void setLocation(FulfillmentPartnerType.Fulfillments.Fulfillment.Location value) {
                this.location = value;
            }

            /**
             * Gets the value of the refs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getRefs() {
                if (refs == null) {
                    refs = new ArrayList<Object>();
                }
                return this.refs;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}StructuredAddress"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airportCode",
                "structuredAddress"
            })
            public static class Location {

                @XmlElement(name = "AirportCode")
                protected AirportCode airportCode;
                @XmlElement(name = "StructuredAddress")
                protected StructuredAddrType structuredAddress;

                /**
                 * Gets the value of the airportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirportCode }
                 *     
                 */
                public AirportCode getAirportCode() {
                    return airportCode;
                }

                /**
                 * Sets the value of the airportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirportCode }
                 *     
                 */
                public void setAirportCode(AirportCode value) {
                    this.airportCode = value;
                }

                /**
                 * Gets the value of the structuredAddress property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredAddrType }
                 *     
                 */
                public StructuredAddrType getStructuredAddress() {
                    return structuredAddress;
                }

                /**
                 * Sets the value of the structuredAddress property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredAddrType }
                 *     
                 */
                public void setStructuredAddress(StructuredAddrType value) {
                    this.structuredAddress = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Start" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="End" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "start",
                "end"
            })
            public static class OfferValidDates {

                @XmlElement(name = "Start")
                protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start start;
                @XmlElement(name = "End")
                protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End end;

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
                 *     
                 */
                public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
                 *     
                 */
                public void setStart(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start value) {
                    this.start = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
                 *     
                 */
                public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
                 *     
                 */
                public void setEnd(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End value) {
                    this.end = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class End
                    extends CoreDateGrpType
                {


                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Start
                    extends CoreDateGrpType
                {


                }

            }

        }

    }

}
