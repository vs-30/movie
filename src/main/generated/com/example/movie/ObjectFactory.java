
package com.example.movie;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.movie package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.1", date = "2025-12-12T13:13:00+05:30")
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.movie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Community }
     * 
     * @return
     *     the new instance of {@link Community }
     */
    public Community createCommunity() {
        return new Community();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     * @return
     *     the new instance of {@link Genre }
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link LikedMovie }
     * 
     * @return
     *     the new instance of {@link LikedMovie }
     */
    public LikedMovie createLikedMovie() {
        return new LikedMovie();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     * @return
     *     the new instance of {@link Movie }
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Recommendation }
     * 
     * @return
     *     the new instance of {@link Recommendation }
     */
    public Recommendation createRecommendation() {
        return new Recommendation();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

}
