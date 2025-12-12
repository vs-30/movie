
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
 *         <element name="communityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="movieId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="likesCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "communityId",
    "movieId",
    "likesCount"
})
@XmlRootElement(name = "LikedMovie")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
public class LikedMovie {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String communityId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String movieId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected int likesCount;

    /**
     * Gets the value of the communityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getCommunityId() {
        return communityId;
    }

    /**
     * Sets the value of the communityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setCommunityId(String value) {
        this.communityId = value;
    }

    /**
     * Gets the value of the movieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setMovieId(String value) {
        this.movieId = value;
    }

    /**
     * Gets the value of the likesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public int getLikesCount() {
        return likesCount;
    }

    /**
     * Sets the value of the likesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setLikesCount(int value) {
        this.likesCount = value;
    }

}
