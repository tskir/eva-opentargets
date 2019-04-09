//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.14 at 04:34:17 PM GMT 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to report the assembly, chromosome, and location of the measure.
 * 
 * <p>Java class for SequenceLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}SequenceLocationAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceLocationType")
public class SequenceLocationType {

    @XmlAttribute(name = "Assembly", required = true)
    protected String assembly;
    @XmlAttribute(name = "Chr", required = true)
    protected String chr;
    @XmlAttribute(name = "Accession")
    protected String accession;
    @XmlAttribute(name = "outerStart")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger outerStart;
    @XmlAttribute(name = "innerStart")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger innerStart;
    @XmlAttribute(name = "start")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger start;
    @XmlAttribute(name = "stop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stop;
    @XmlAttribute(name = "innerStop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger innerStop;
    @XmlAttribute(name = "outerStop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outerStop;
    @XmlAttribute(name = "display_start")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger displayStart;
    @XmlAttribute(name = "display_stop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger displayStop;
    @XmlAttribute(name = "Strand")
    protected String strand;
    @XmlAttribute(name = "variantLength")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger variantLength;
    @XmlAttribute(name = "referenceAllele")
    protected String referenceAllele;
    @XmlAttribute(name = "alternateAllele")
    protected String alternateAllele;
    @XmlAttribute(name = "AssemblyAccessionVersion")
    protected String assemblyAccessionVersion;
    @XmlAttribute(name = "AssemblyStatus")
    protected String assemblyStatus;
    @XmlAttribute(name = "positionVCF")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger positionVCF;
    @XmlAttribute(name = "referenceAlleleVCF")
    protected String referenceAlleleVCF;
    @XmlAttribute(name = "alternateAlleleVCF")
    protected String alternateAlleleVCF;
    @XmlAttribute(name = "forDisplayLength")
    protected Boolean forDisplayLength;

    /**
     * Gets the value of the assembly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssembly() {
        return assembly;
    }

    /**
     * Sets the value of the assembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssembly(String value) {
        this.assembly = value;
    }

    /**
     * Gets the value of the chr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChr() {
        return chr;
    }

    /**
     * Sets the value of the chr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChr(String value) {
        this.chr = value;
    }

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }

    /**
     * Gets the value of the outerStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOuterStart() {
        return outerStart;
    }

    /**
     * Sets the value of the outerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOuterStart(BigInteger value) {
        this.outerStart = value;
    }

    /**
     * Gets the value of the innerStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInnerStart() {
        return innerStart;
    }

    /**
     * Sets the value of the innerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInnerStart(BigInteger value) {
        this.innerStart = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStop(BigInteger value) {
        this.stop = value;
    }

    /**
     * Gets the value of the innerStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInnerStop() {
        return innerStop;
    }

    /**
     * Sets the value of the innerStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInnerStop(BigInteger value) {
        this.innerStop = value;
    }

    /**
     * Gets the value of the outerStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOuterStop() {
        return outerStop;
    }

    /**
     * Sets the value of the outerStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOuterStop(BigInteger value) {
        this.outerStop = value;
    }

    /**
     * Gets the value of the displayStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayStart() {
        return displayStart;
    }

    /**
     * Sets the value of the displayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayStart(BigInteger value) {
        this.displayStart = value;
    }

    /**
     * Gets the value of the displayStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayStop() {
        return displayStop;
    }

    /**
     * Sets the value of the displayStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayStop(BigInteger value) {
        this.displayStop = value;
    }

    /**
     * Gets the value of the strand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrand() {
        return strand;
    }

    /**
     * Sets the value of the strand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrand(String value) {
        this.strand = value;
    }

    /**
     * Gets the value of the variantLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVariantLength() {
        return variantLength;
    }

    /**
     * Sets the value of the variantLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVariantLength(BigInteger value) {
        this.variantLength = value;
    }

    /**
     * Gets the value of the referenceAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAllele() {
        return referenceAllele;
    }

    /**
     * Sets the value of the referenceAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAllele(String value) {
        this.referenceAllele = value;
    }

    /**
     * Gets the value of the alternateAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAllele() {
        return alternateAllele;
    }

    /**
     * Sets the value of the alternateAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAllele(String value) {
        this.alternateAllele = value;
    }

    /**
     * Gets the value of the assemblyAccessionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyAccessionVersion() {
        return assemblyAccessionVersion;
    }

    /**
     * Sets the value of the assemblyAccessionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyAccessionVersion(String value) {
        this.assemblyAccessionVersion = value;
    }

    /**
     * Gets the value of the assemblyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyStatus() {
        return assemblyStatus;
    }

    /**
     * Sets the value of the assemblyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyStatus(String value) {
        this.assemblyStatus = value;
    }

    /**
     * Gets the value of the positionVCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionVCF() {
        return positionVCF;
    }

    /**
     * Sets the value of the positionVCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionVCF(BigInteger value) {
        this.positionVCF = value;
    }

    /**
     * Gets the value of the referenceAlleleVCF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAlleleVCF() {
        return referenceAlleleVCF;
    }

    /**
     * Sets the value of the referenceAlleleVCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAlleleVCF(String value) {
        this.referenceAlleleVCF = value;
    }

    /**
     * Gets the value of the alternateAlleleVCF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAlleleVCF() {
        return alternateAlleleVCF;
    }

    /**
     * Sets the value of the alternateAlleleVCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAlleleVCF(String value) {
        this.alternateAlleleVCF = value;
    }

    /**
     * Gets the value of the forDisplayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForDisplayLength() {
        return forDisplayLength;
    }

    /**
     * Sets the value of the forDisplayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForDisplayLength(Boolean value) {
        this.forDisplayLength = value;
    }

}