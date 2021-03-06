package com.nubeclick.pos.dto;
// Generated 07/04/2018 08:40:29 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Warehouse generated by hbm2java
 */
@Entity
@Table(name="warehouse"
    ,catalog="posnubeclick"
)
public class Warehouse  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -395598041170663610L;
	private int warehouseId;
     private String warehouseDescription;
     private Set<Product> products = new HashSet<Product>(0);
     private Set<Purchase> purchases = new HashSet<Purchase>(0);

    public Warehouse() {
    }

	
    public Warehouse(int warehouseId, String warehouseDescription) {
        this.warehouseId = warehouseId;
        this.warehouseDescription = warehouseDescription;
    }
    public Warehouse(int warehouseId, String warehouseDescription, Set<Product> products, Set<Purchase> purchases) {
       this.warehouseId = warehouseId;
       this.warehouseDescription = warehouseDescription;
       this.products = products;
       this.purchases = purchases;
    }
   
     @Id 

    
    @Column(name="warehouse_id", unique=true, nullable=false)
    public int getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    
    @Column(name="warehouse_description", nullable=false, length=150)
    public String getWarehouseDescription() {
        return this.warehouseDescription;
    }
    
    public void setWarehouseDescription(String warehouseDescription) {
        this.warehouseDescription = warehouseDescription;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="warehouse")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="warehouse")
    public Set<Purchase> getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }




}


