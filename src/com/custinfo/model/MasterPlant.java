package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * MasterPlant generated by hbm2java
 */
@Entity
@Table(name = "master_plant", catalog = "db_payroll", uniqueConstraints = @UniqueConstraint(columnNames = "PlantName"))
public class MasterPlant implements java.io.Serializable {

	private Integer plantId;
	private Date timeStamp;
	private MasterCompany masterCompany;
	private MasterUser masterUser;
	private String plantName;
	private Date establishmentDate;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String phone;
	private String email;
	private String fax;
	private String reg;
	private String pan;
	private String ecc;
	private String serviceTax;
	private String csttin;
	private String vattin;
	private String lbt;
	private String jurRange;
	private String jurDivision;
	private String jurCommissionrate;
	private String jurArea;
	private Byte isActive;
	private Set employeeMasters = new HashSet(0);

	public MasterPlant() {
	}

	public MasterPlant(MasterCompany masterCompany, MasterUser masterUser,
			String plantName, String address1, String city, String state,
			String country, String phone) {
		this.masterCompany = masterCompany;
		this.masterUser = masterUser;
		this.plantName = plantName;
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}

	public MasterPlant(MasterCompany masterCompany, MasterUser masterUser,
			String plantName, Date establishmentDate, String address1,
			String address2, String city, String state, String country,
			String pincode, String phone, String email, String fax, String reg,
			String pan, String ecc, String serviceTax, String csttin,
			String vattin, String lbt, String jurRange, String jurDivision,
			String jurCommissionrate, String jurArea, Byte isActive,
			Set employeeMasters) {
		this.masterCompany = masterCompany;
		this.masterUser = masterUser;
		this.plantName = plantName;
		this.establishmentDate = establishmentDate;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.phone = phone;
		this.email = email;
		this.fax = fax;
		this.reg = reg;
		this.pan = pan;
		this.ecc = ecc;
		this.serviceTax = serviceTax;
		this.csttin = csttin;
		this.vattin = vattin;
		this.lbt = lbt;
		this.jurRange = jurRange;
		this.jurDivision = jurDivision;
		this.jurCommissionrate = jurCommissionrate;
		this.jurArea = jurArea;
		this.isActive = isActive;
		this.employeeMasters = employeeMasters;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PlantId", unique = true, nullable = false)
	public Integer getPlantId() {
		return this.plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TimeStamp", length = 19)
	public Date getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CompanyId", nullable = false)
	public MasterCompany getMasterCompany() {
		return this.masterCompany;
	}

	public void setMasterCompany(MasterCompany masterCompany) {
		this.masterCompany = masterCompany;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserId", nullable = false)
	public MasterUser getMasterUser() {
		return this.masterUser;
	}

	public void setMasterUser(MasterUser masterUser) {
		this.masterUser = masterUser;
	}

	@Column(name = "PlantName", unique = true, nullable = false, length = 45)
	public String getPlantName() {
		return this.plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EstablishmentDate", length = 10)
	public Date getEstablishmentDate() {
		return this.establishmentDate;
	}

	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	@Column(name = "Address1", nullable = false, length = 90)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "Address2", length = 90)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "City", nullable = false, length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "State", nullable = false, length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Country", nullable = false, length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "Pincode", length = 20)
	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "Phone", nullable = false, length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Fax", length = 20)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "Reg", length = 45)
	public String getReg() {
		return this.reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	@Column(name = "PAN", length = 45)
	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Column(name = "ECC", length = 20)
	public String getEcc() {
		return this.ecc;
	}

	public void setEcc(String ecc) {
		this.ecc = ecc;
	}

	@Column(name = "ServiceTax", length = 45)
	public String getServiceTax() {
		return this.serviceTax;
	}

	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}

	@Column(name = "CSTTin", length = 45)
	public String getCsttin() {
		return this.csttin;
	}

	public void setCsttin(String csttin) {
		this.csttin = csttin;
	}

	@Column(name = "VATTin", length = 45)
	public String getVattin() {
		return this.vattin;
	}

	public void setVattin(String vattin) {
		this.vattin = vattin;
	}

	@Column(name = "LBT", length = 45)
	public String getLbt() {
		return this.lbt;
	}

	public void setLbt(String lbt) {
		this.lbt = lbt;
	}

	@Column(name = "JurRange", length = 45)
	public String getJurRange() {
		return this.jurRange;
	}

	public void setJurRange(String jurRange) {
		this.jurRange = jurRange;
	}

	@Column(name = "JurDivision", length = 45)
	public String getJurDivision() {
		return this.jurDivision;
	}

	public void setJurDivision(String jurDivision) {
		this.jurDivision = jurDivision;
	}

	@Column(name = "JurCommissionrate", length = 45)
	public String getJurCommissionrate() {
		return this.jurCommissionrate;
	}

	public void setJurCommissionrate(String jurCommissionrate) {
		this.jurCommissionrate = jurCommissionrate;
	}

	@Column(name = "JurArea", length = 45)
	public String getJurArea() {
		return this.jurArea;
	}

	public void setJurArea(String jurArea) {
		this.jurArea = jurArea;
	}

	@Column(name = "IsActive")
	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterPlant")
	public Set getEmployeeMasters() {
		return this.employeeMasters;
	}

	public void setEmployeeMasters(Set employeeMasters) {
		this.employeeMasters = employeeMasters;
	}

}