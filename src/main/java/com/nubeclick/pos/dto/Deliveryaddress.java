package com.nubeclick.pos.dto;
// Generated 07/04/2018 08:40:29 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Deliveryaddress generated by hbm2java
 */
@Entity
@Table(name="deliveryaddress"
    ,catalog="posnubeclick"
)
public class Deliveryaddress  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -3501657134776324585L;
	private Integer deliveryId;
     private String deliveryDescription;
     private String deliveryStreet;
     private String deliveryExternal;
     private String deliveryInternal;
     private String deliveryLocation;
     private String deliveryCity;
     private Set<Customer> customers = new HashSet<Customer>(0);
     private Set<Deliveryorder> deliveryorders = new HashSet<Deliveryorder>(0);

    public Deliveryaddress() {
    }

	
    public Deliveryaddress(String deliveryDescription, String deliveryStreet, String deliveryExternal, String deliveryInternal, String deliveryLocation, String deliveryCity) {
        this.deliveryDescription = deliveryDescription;
        this.deliveryStreet = deliveryStreet;
        this.deliveryExternal = deliveryExternal;
        this.deliveryInternal = deliveryInternal;
        this.deliveryLocation = deliveryLocation;
        this.deliveryCity = deliveryCity;
    }
    public Deliveryaddress(String deliveryDescription, String deliveryStreet, String deliveryExternal, String deliveryInternal, String deliveryLocation, String deliveryCity, Set<Customer> customers, Set<Deliveryorder> deliveryorders) {
       this.deliveryDescription = deliveryDescription;
       this.deliveryStreet = deliveryStreet;
       this.deliveryExternal = deliveryExternal;
       this.deliveryInternal = deliveryInternal;
       this.deliveryLocation = deliveryLocation;
       this.deliveryCity = deliveryCity;
       this.customers = customers;
       this.deliveryorders = deliveryorders;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="delivery_id", unique=true, nullable=false)
    public Integer getDeliveryId() {
        return this.deliveryId;
    }
    
    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    
    @Column(name="delivery_description", nullable=false)
    public String getDeliveryDescription() {
        return this.deliveryDescription;
    }
    
    public void setDeliveryDescription(String deliveryDescription) {
        this.deliveryDescription = deliveryDescription;
    }

    
    @Column(name="delivery_street", nullable=false, length=100)
    public String getDeliveryStreet() {
        return this.deliveryStreet;
    }
    
    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    
    @Column(name="delivery_external", nullable=false, length=45)
    public String getDeliveryExternal() {
        return this.deliveryExternal;
    }
    
    public void setDeliveryExternal(String deliveryExternal) {
        this.deliveryExternal = deliveryExternal;
    }

    
    @Column(name="delivery_internal", nullable=false, length=45)
    public String getDeliveryInternal() {
        return this.deliveryInternal;
    }
    
    public void setDeliveryInternal(String deliveryInternal) {
        this.deliveryInternal = deliveryInternal;
    }

    
    @Column(name="delivery_location", nullable=false, length=45)
    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }
    
    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    
    @Column(name="delivery_city", nullable=false, length=45)
    public String getDeliveryCity() {
        return this.deliveryCity;
    }
    
    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="deliveryaddress")
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="deliveryaddress")
    public Set<Deliveryorder> getDeliveryorders() {
        return this.deliveryorders;
    }
    
    public void setDeliveryorders(Set<Deliveryorder> deliveryorders) {
        this.deliveryorders = deliveryorders;
    }




}

