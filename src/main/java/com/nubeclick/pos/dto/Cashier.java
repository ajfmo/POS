package com.nubeclick.pos.dto;
// Generated 07/04/2018 08:40:29 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cashier generated by hbm2java
 */
@Entity
@Table(name="cashier"
    ,catalog="posnubeclick"
)
public class Cashier  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 8056924910485725532L;
	private int cashierId;
     private Employee employee;
     private User user;
     private String cashierName;
     private String cashierFsurname;
     private String cashierSsurname;
     private String cashierAddress;
     private byte cashierAddressExternal;
     private Byte cashierAddressInternal;
     private String cashierLocation;
     private String cashierCity;
     private String cashierLphone;
     private String cashierMphone;
     private Double cashierComission;
     private Set<Sale> sales = new HashSet<Sale>(0);
     private Set<Closingsales> closingsaleses = new HashSet<Closingsales>(0);

    public Cashier() {
    }

	
    public Cashier(int cashierId, Employee employee, User user, String cashierName, String cashierFsurname, String cashierSsurname, String cashierAddress, byte cashierAddressExternal, String cashierLocation, String cashierCity, String cashierLphone) {
        this.cashierId = cashierId;
        this.employee = employee;
        this.user = user;
        this.cashierName = cashierName;
        this.cashierFsurname = cashierFsurname;
        this.cashierSsurname = cashierSsurname;
        this.cashierAddress = cashierAddress;
        this.cashierAddressExternal = cashierAddressExternal;
        this.cashierLocation = cashierLocation;
        this.cashierCity = cashierCity;
        this.cashierLphone = cashierLphone;
    }
    public Cashier(int cashierId, Employee employee, User user, String cashierName, String cashierFsurname, String cashierSsurname, String cashierAddress, byte cashierAddressExternal, Byte cashierAddressInternal, String cashierLocation, String cashierCity, String cashierLphone, String cashierMphone, Double cashierComission, Set<Sale> sales, Set<Closingsales> closingsaleses) {
       this.cashierId = cashierId;
       this.employee = employee;
       this.user = user;
       this.cashierName = cashierName;
       this.cashierFsurname = cashierFsurname;
       this.cashierSsurname = cashierSsurname;
       this.cashierAddress = cashierAddress;
       this.cashierAddressExternal = cashierAddressExternal;
       this.cashierAddressInternal = cashierAddressInternal;
       this.cashierLocation = cashierLocation;
       this.cashierCity = cashierCity;
       this.cashierLphone = cashierLphone;
       this.cashierMphone = cashierMphone;
       this.cashierComission = cashierComission;
       this.sales = sales;
       this.closingsaleses = closingsaleses;
    }
   
     @Id 

    
    @Column(name="cashier_id", unique=true, nullable=false)
    public int getCashierId() {
        return this.cashierId;
    }
    
    public void setCashierId(int cashierId) {
        this.cashierId = cashierId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="cashier_name", nullable=false, length=150)
    public String getCashierName() {
        return this.cashierName;
    }
    
    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    
    @Column(name="cashier_Fsurname", nullable=false, length=100)
    public String getCashierFsurname() {
        return this.cashierFsurname;
    }
    
    public void setCashierFsurname(String cashierFsurname) {
        this.cashierFsurname = cashierFsurname;
    }

    
    @Column(name="cashier_Ssurname", nullable=false, length=100)
    public String getCashierSsurname() {
        return this.cashierSsurname;
    }
    
    public void setCashierSsurname(String cashierSsurname) {
        this.cashierSsurname = cashierSsurname;
    }

    
    @Column(name="cashier_address", nullable=false, length=150)
    public String getCashierAddress() {
        return this.cashierAddress;
    }
    
    public void setCashierAddress(String cashierAddress) {
        this.cashierAddress = cashierAddress;
    }

    
    @Column(name="cashier_address_external", nullable=false)
    public byte getCashierAddressExternal() {
        return this.cashierAddressExternal;
    }
    
    public void setCashierAddressExternal(byte cashierAddressExternal) {
        this.cashierAddressExternal = cashierAddressExternal;
    }

    
    @Column(name="cashier_address_internal")
    public Byte getCashierAddressInternal() {
        return this.cashierAddressInternal;
    }
    
    public void setCashierAddressInternal(Byte cashierAddressInternal) {
        this.cashierAddressInternal = cashierAddressInternal;
    }

    
    @Column(name="cashier_location", nullable=false, length=100)
    public String getCashierLocation() {
        return this.cashierLocation;
    }
    
    public void setCashierLocation(String cashierLocation) {
        this.cashierLocation = cashierLocation;
    }

    
    @Column(name="cashier_city", nullable=false, length=100)
    public String getCashierCity() {
        return this.cashierCity;
    }
    
    public void setCashierCity(String cashierCity) {
        this.cashierCity = cashierCity;
    }

    
    @Column(name="cashier_Lphone", nullable=false, length=45)
    public String getCashierLphone() {
        return this.cashierLphone;
    }
    
    public void setCashierLphone(String cashierLphone) {
        this.cashierLphone = cashierLphone;
    }

    
    @Column(name="cashier_Mphone", length=45)
    public String getCashierMphone() {
        return this.cashierMphone;
    }
    
    public void setCashierMphone(String cashierMphone) {
        this.cashierMphone = cashierMphone;
    }

    
    @Column(name="cashier_comission", precision=22, scale=0)
    public Double getCashierComission() {
        return this.cashierComission;
    }
    
    public void setCashierComission(Double cashierComission) {
        this.cashierComission = cashierComission;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cashier")
    public Set<Sale> getSales() {
        return this.sales;
    }
    
    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cashier")
    public Set<Closingsales> getClosingsaleses() {
        return this.closingsaleses;
    }
    
    public void setClosingsaleses(Set<Closingsales> closingsaleses) {
        this.closingsaleses = closingsaleses;
    }




}

