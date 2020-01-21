//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.21 at 10:36:51 AM GMT 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Co-occurrenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Co-occurrenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zygosity" type="{}ZygosityType" minOccurs="0"/>
 *         &lt;element name="AlleleDescSet" type="{}AlleleDescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Co-occurrenceType", propOrder = {
    "zygosity",
    "alleleDescSet",
    "count"
})
public class CoOccurrenceType {

    @XmlElement(name = "Zygosity")
    @XmlSchemaType(name = "string")
    protected ZygosityType zygosity;
    @XmlElement(name = "AlleleDescSet")
    protected List<AlleleDescType> alleleDescSet;
    @XmlElement(name = "Count")
    protected Integer count;

    /**
     * Gets the value of the zygosity property.
     * 
     * @return
     *     possible object is
     *     {@link ZygosityType }
     *     
     */
    public ZygosityType getZygosity() {
        return zygosity;
    }

    /**
     * Sets the value of the zygosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZygosityType }
     *     
     */
    public void setZygosity(ZygosityType value) {
        this.zygosity = value;
    }

    /**
     * Gets the value of the alleleDescSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alleleDescSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlleleDescSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlleleDescType }
     * 
     * 
     */
    public List<AlleleDescType> getAlleleDescSet() {
        if (alleleDescSet == null) {
            alleleDescSet = new ArrayList<AlleleDescType>();
        }
        return this.alleleDescSet;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
