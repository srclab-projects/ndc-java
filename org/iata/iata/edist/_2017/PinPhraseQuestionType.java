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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Traveler Authentication Challenge Question definition.
 * 
 * <p>Java class for PinPhraseQuestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinPhraseQuestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.2>CustomerAuthStatusSimpleType">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Challenge">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="Parameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                             &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                             &lt;element name="Positions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Position" maxOccurs="unbounded">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;minInclusive value="1"/>
 *                                             &lt;maxInclusive value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}MultiAssociationType"/>
 *         &lt;element name="AuthAccount" type="{http://www.iata.org/IATA/EDIST/2017.2}AuthAccountType" minOccurs="0"/>
 *         &lt;element name="Device" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}DeviceType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Position" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginalTransactionID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "PinPhraseQuestionType", propOrder = {
    "status",
    "challenge",
    "associations",
    "authAccount",
    "device",
    "originalTransactionID"
})
@XmlSeeAlso({
    org.iata.iata.edist._2017.PINAuthTravelerType.AuthRequest.class
})
public class PinPhraseQuestionType {

    @XmlElement(name = "Status")
    protected PinPhraseQuestionType.Status status;
    @XmlElement(name = "Challenge", required = true)
    protected PinPhraseQuestionType.Challenge challenge;
    @XmlElement(name = "Associations", required = true)
    protected MultiAssociationType associations;
    @XmlElement(name = "AuthAccount")
    protected AuthAccountType authAccount;
    @XmlElement(name = "Device")
    protected PinPhraseQuestionType.Device device;
    @XmlElement(name = "OriginalTransactionID")
    protected PinPhraseQuestionType.OriginalTransactionID originalTransactionID;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Status }
     *     
     */
    public PinPhraseQuestionType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Status }
     *     
     */
    public void setStatus(PinPhraseQuestionType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Challenge }
     *     
     */
    public PinPhraseQuestionType.Challenge getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Challenge }
     *     
     */
    public void setChallenge(PinPhraseQuestionType.Challenge value) {
        this.challenge = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the authAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAccountType }
     *     
     */
    public AuthAccountType getAuthAccount() {
        return authAccount;
    }

    /**
     * Sets the value of the authAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAccountType }
     *     
     */
    public void setAuthAccount(AuthAccountType value) {
        this.authAccount = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Device }
     *     
     */
    public PinPhraseQuestionType.Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Device }
     *     
     */
    public void setDevice(PinPhraseQuestionType.Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the originalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.OriginalTransactionID }
     *     
     */
    public PinPhraseQuestionType.OriginalTransactionID getOriginalTransactionID() {
        return originalTransactionID;
    }

    /**
     * Sets the value of the originalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.OriginalTransactionID }
     *     
     */
    public void setOriginalTransactionID(PinPhraseQuestionType.OriginalTransactionID value) {
        this.originalTransactionID = value;
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
     *         &lt;element name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="Parameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *                   &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *                   &lt;element name="Positions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Position" maxOccurs="unbounded">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;minInclusive value="1"/>
     *                                   &lt;maxInclusive value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "sourceURL",
        "parameters"
    })
    public static class Challenge {

        @XmlElement(name = "SourceURL")
        @XmlSchemaType(name = "anyURI")
        protected String sourceURL;
        @XmlElement(name = "Parameters")
        protected PinPhraseQuestionType.Challenge.Parameters parameters;

        /**
         * Gets the value of the sourceURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceURL() {
            return sourceURL;
        }

        /**
         * Sets the value of the sourceURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceURL(String value) {
            this.sourceURL = value;
        }

        /**
         * Gets the value of the parameters property.
         * 
         * @return
         *     possible object is
         *     {@link PinPhraseQuestionType.Challenge.Parameters }
         *     
         */
        public PinPhraseQuestionType.Challenge.Parameters getParameters() {
            return parameters;
        }

        /**
         * Sets the value of the parameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link PinPhraseQuestionType.Challenge.Parameters }
         *     
         */
        public void setParameters(PinPhraseQuestionType.Challenge.Parameters value) {
            this.parameters = value;
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
         *         &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
         *         &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
         *         &lt;element name="Positions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Position" maxOccurs="unbounded">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;minInclusive value="1"/>
         *                         &lt;maxInclusive value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
            "challengeQuestion",
            "phrasePrompt",
            "positions"
        })
        public static class Parameters {

            @XmlElement(name = "ChallengeQuestion")
            protected String challengeQuestion;
            @XmlElement(name = "PhrasePrompt")
            protected String phrasePrompt;
            @XmlElement(name = "Positions")
            protected PinPhraseQuestionType.Challenge.Parameters.Positions positions;

            /**
             * Gets the value of the challengeQuestion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChallengeQuestion() {
                return challengeQuestion;
            }

            /**
             * Sets the value of the challengeQuestion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChallengeQuestion(String value) {
                this.challengeQuestion = value;
            }

            /**
             * Gets the value of the phrasePrompt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhrasePrompt() {
                return phrasePrompt;
            }

            /**
             * Sets the value of the phrasePrompt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhrasePrompt(String value) {
                this.phrasePrompt = value;
            }

            /**
             * Gets the value of the positions property.
             * 
             * @return
             *     possible object is
             *     {@link PinPhraseQuestionType.Challenge.Parameters.Positions }
             *     
             */
            public PinPhraseQuestionType.Challenge.Parameters.Positions getPositions() {
                return positions;
            }

            /**
             * Sets the value of the positions property.
             * 
             * @param value
             *     allowed object is
             *     {@link PinPhraseQuestionType.Challenge.Parameters.Positions }
             *     
             */
            public void setPositions(PinPhraseQuestionType.Challenge.Parameters.Positions value) {
                this.positions = value;
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
             *         &lt;element name="Position" maxOccurs="unbounded">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;minInclusive value="1"/>
             *               &lt;maxInclusive value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "position"
            })
            public static class Positions {

                @XmlElement(name = "Position", type = Integer.class)
                protected List<Integer> position;

                /**
                 * Gets the value of the position property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the position property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPosition().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getPosition() {
                    if (position == null) {
                        position = new ArrayList<Integer>();
                    }
                    return this.position;
                }

            }

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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}DeviceType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Position" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Device
        extends DeviceType
    {

        @XmlElement(name = "Position")
        protected Position position;

        /**
         * Device Location geocoding information.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class OriginalTransactionID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.2>CustomerAuthStatusSimpleType">
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Status {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for 3DS Program ACS Customer Authentication status. Examples: Y- Customer authenticated N- Customer not authenticated A- An authentication attempt occurred but could not be completed U- Unable to perform authentication
         *       
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }

}
