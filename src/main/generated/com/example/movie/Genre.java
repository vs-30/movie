
package com.example.movie;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="genreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "genreId",
    "name"
})
@XmlRootElement(name = "Genre")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
public class Genre {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String genreId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String name;

    /**
     * Gets the value of the genreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getGenreId() {
        return genreId;
    }

    /**
     * Sets the value of the genreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setGenreId(String value) {
        this.genreId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setName(String value) {
        this.name = value;
    }

}
