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
 * Employee generated by hbm2java
 */
@Entity
@Table(name="employee"
    ,catalog="posnubeclick"
)
public class Employee  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -7899658933559182916L;
	private int employeeId;
     private Role role;
     private User user;
     private String employeeName;
     private String employeeFsurname;
     private String employeeSsurname;
     private String employeeAddress;
     private byte employeeAddressExternal;
     private Byte employeeAddressInternal;
     private String employeeLocation;
     private String employeeCity;
     private String employeeLphone;
     private String employeeMphone;
     private Double employeeSalary;
     private Set<Purchase> purchases = new HashSet<Purchase>(0);
     private Set<Cashier> cashiers = new HashSet<Cashier>(0);

    public Employee() {
    }

	
    public Employee(int employeeId, Role role, String employeeName, String employeeFsurname, String employeeSsurname, String employeeAddress, byte employeeAddressExternal, String employeeLocation, String employeeCity, String employeeLphone, String employeeMphone) {
        this.employeeId = employeeId;
        this.role = role;
        this.employeeName = employeeName;
        this.employeeFsurname = employeeFsurname;
        this.employeeSsurname = employeeSsurname;
        this.employeeAddress = employeeAddress;
        this.employeeAddressExternal = employeeAddressExternal;
        this.employeeLocation = employeeLocation;
        this.employeeCity = employeeCity;
        this.employeeLphone = employeeLphone;
        this.employeeMphone = employeeMphone;
    }
    public Employee(int employeeId, Role role, User user, String employeeName, String employeeFsurname, String employeeSsurname, String employeeAddress, byte employeeAddressExternal, Byte employeeAddressInternal, String employeeLocation, String employeeCity, String employeeLphone, String employeeMphone, Double employeeSalary, Set<Purchase> purchases, Set<Cashier> cashiers) {
       this.employeeId = employeeId;
       this.role = role;
       this.user = user;
       this.employeeName = employeeName;
       this.employeeFsurname = employeeFsurname;
       this.employeeSsurname = employeeSsurname;
       this.employeeAddress = employeeAddress;
       this.employeeAddressExternal = employeeAddressExternal;
       this.employeeAddressInternal = employeeAddressInternal;
       this.employeeLocation = employeeLocation;
       this.employeeCity = employeeCity;
       this.employeeLphone = employeeLphone;
       this.employeeMphone = employeeMphone;
       this.employeeSalary = employeeSalary;
       this.purchases = purchases;
       this.cashiers = cashiers;
    }
   
     @Id 

    
    @Column(name="employee_id", unique=true, nullable=false)
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="employee_name", nullable=false, length=150)
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    @Column(name="employee_FSurname", nullable=false, length=100)
    public String getEmployeeFsurname() {
        return this.employeeFsurname;
    }
    
    public void setEmployeeFsurname(String employeeFsurname) {
        this.employeeFsurname = employeeFsurname;
    }

    
    @Column(name="employee_Ssurname", nullable=false, length=100)
    public String getEmployeeSsurname() {
        return this.employeeSsurname;
    }
    
    public void setEmployeeSsurname(String employeeSsurname) {
        this.employeeSsurname = employeeSsurname;
    }

    
    @Column(name="employee_address", nullable=false)
    public String getEmployeeAddress() {
        return this.employeeAddress;
    }
    
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    
    @Column(name="employee_address_external", nullable=false)
    public byte getEmployeeAddressExternal() {
        return this.employeeAddressExternal;
    }
    
    public void setEmployeeAddressExternal(byte employeeAddressExternal) {
        this.employeeAddressExternal = employeeAddressExternal;
    }

    
    @Column(name="employee_address_internal")
    public Byte getEmployeeAddressInternal() {
        return this.employeeAddressInternal;
    }
    
    public void setEmployeeAddressInternal(Byte employeeAddressInternal) {
        this.employeeAddressInternal = employeeAddressInternal;
    }

    
    @Column(name="employee_location", nullable=false, length=100)
    public String getEmployeeLocation() {
        return this.employeeLocation;
    }
    
    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    
    @Column(name="employee_city", nullable=false, length=100)
    public String getEmployeeCity() {
        return this.employeeCity;
    }
    
    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    
    @Column(name="employee_Lphone", nullable=false, length=45)
    public String getEmployeeLphone() {
        return this.employeeLphone;
    }
    
    public void setEmployeeLphone(String employeeLphone) {
        this.employeeLphone = employeeLphone;
    }

    
    @Column(name="employee_Mphone", nullable=false, length=45)
    public String getEmployeeMphone() {
        return this.employeeMphone;
    }
    
    public void setEmployeeMphone(String employeeMphone) {
        this.employeeMphone = employeeMphone;
    }

    
    @Column(name="employee_salary", precision=22, scale=0)
    public Double getEmployeeSalary() {
        return this.employeeSalary;
    }
    
    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Purchase> getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Cashier> getCashiers() {
        return this.cashiers;
    }
    
    public void setCashiers(Set<Cashier> cashiers) {
        this.cashiers = cashiers;
    }




}


