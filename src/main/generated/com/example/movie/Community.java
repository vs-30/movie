
package com.example.movie;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="joinLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="memberIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="favouriteMovieIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="mostLikedMovieId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "name",
    "description",
    "isPrivate",
    "joinLink",
    "memberIds",
    "favouriteMovieIds",
    "mostLikedMovieId"
})
@XmlRootElement(name = "Community")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
public class Community {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String communityId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String description;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected boolean isPrivate;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String joinLink;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected List<String> memberIds;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected List<String> favouriteMovieIds;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String mostLikedMovieId;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setIsPrivate(boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the joinLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getJoinLink() {
        return joinLink;
    }

    /**
     * Sets the value of the joinLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setJoinLink(String value) {
        this.joinLink = value;
    }

    /**
     * Gets the value of the memberIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the memberIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the memberIds property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public List<String> getMemberIds() {
        if (memberIds == null) {
            memberIds = new ArrayList<>();
        }
        return this.memberIds;
    }

    /**
     * Gets the value of the favouriteMovieIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the favouriteMovieIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavouriteMovieIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the favouriteMovieIds property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public List<String> getFavouriteMovieIds() {
        if (favouriteMovieIds == null) {
            favouriteMovieIds = new ArrayList<>();
        }
        return this.favouriteMovieIds;
    }

    /**
     * Gets the value of the mostLikedMovieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getMostLikedMovieId() {
        return mostLikedMovieId;
    }

    /**
     * Sets the value of the mostLikedMovieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setMostLikedMovieId(String value) {
        this.mostLikedMovieId = value;
    }

}
