//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.21 at 10:36:51 AM GMT 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Methodtypelist.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Methodtypelist">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="literature only"/>
 *     &lt;enumeration value="reference population"/>
 *     &lt;enumeration value="case-control"/>
 *     &lt;enumeration value="clinical testing"/>
 *     &lt;enumeration value="in vitro"/>
 *     &lt;enumeration value="in vivo"/>
 *     &lt;enumeration value="research"/>
 *     &lt;enumeration value="curation"/>
 *     &lt;enumeration value="not provided"/>
 *     &lt;enumeration value="provider interpretation"/>
 *     &lt;enumeration value="phenotyping only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Methodtypelist")
@XmlEnum
public enum Methodtypelist {

    @XmlEnumValue("literature only")
    LITERATURE_ONLY("literature only"),
    @XmlEnumValue("reference population")
    REFERENCE_POPULATION("reference population"),
    @XmlEnumValue("case-control")
    CASE_CONTROL("case-control"),
    @XmlEnumValue("clinical testing")
    CLINICAL_TESTING("clinical testing"),
    @XmlEnumValue("in vitro")
    IN_VITRO("in vitro"),
    @XmlEnumValue("in vivo")
    IN_VIVO("in vivo"),
    @XmlEnumValue("research")
    RESEARCH("research"),
    @XmlEnumValue("curation")
    CURATION("curation"),
    @XmlEnumValue("not provided")
    NOT_PROVIDED("not provided"),
    @XmlEnumValue("provider interpretation")
    PROVIDER_INTERPRETATION("provider interpretation"),
    @XmlEnumValue("phenotyping only")
    PHENOTYPING_ONLY("phenotyping only");
    private final String value;

    Methodtypelist(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Methodtypelist fromValue(String v) {
        for (Methodtypelist c: Methodtypelist.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
