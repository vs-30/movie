
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
 *         <element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="selectedMovieIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="recommendedMovieIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "userId",
    "selectedMovieIds",
    "recommendedMovieIds"
})
@XmlRootElement(name = "Recommendation")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
public class Recommendation {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected String userId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected List<String> selectedMovieIds;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    protected List<String> recommendedMovieIds;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the selectedMovieIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the selectedMovieIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedMovieIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the selectedMovieIds property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public List<String> getSelectedMovieIds() {
        if (selectedMovieIds == null) {
            selectedMovieIds = new ArrayList<>();
        }
        return this.selectedMovieIds;
    }

    /**
     * Gets the value of the recommendedMovieIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recommendedMovieIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedMovieIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the recommendedMovieIds property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
    public List<String> getRecommendedMovieIds() {
        if (recommendedMovieIds == null) {
            recommendedMovieIds = new ArrayList<>();
        }
        return this.recommendedMovieIds;
    }

}
