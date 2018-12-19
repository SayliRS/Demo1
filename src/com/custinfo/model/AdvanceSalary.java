package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * AdvanceSalary generated by hbm2java
 */
@Entity
@Table(name = "advance_salary", catalog = "db_payroll", uniqueConstraints = @UniqueConstraint(columnNames = {
		"EmpId", "Date" }))
public class AdvanceSalary implements java.io.Serializable {

	private Long adsId;
	private Date timeStamp;
	private Long empId;
	private Date date;
	private Double amount;
	private Double balanceAmount;
	private Boolean complete;
	private Long insertedBy;
	private Date insertTs;
	private Long updatedBy;
	private Date updateTs;
	private Long deletedBy;
	private Date deleteTs;
	private Boolean isEditable;
	private Boolean isDeletable;
	private Integer plantId;

	public AdvanceSalary() {
	}

	public AdvanceSalary(Long empId, Date date, Double amount,
			Double balanceAmount, Boolean complete, Long insertedBy,
			Date insertTs, Long updatedBy, Date updateTs, Long deletedBy,
			Date deleteTs, Boolean isEditable, Boolean isDeletable,
			Integer plantId) {
		this.empId = empId;
		this.date = date;
		this.amount = amount;
		this.balanceAmount = balanceAmount;
		this.complete = complete;
		this.insertedBy = insertedBy;
		this.insertTs = insertTs;
		this.updatedBy = updatedBy;
		this.updateTs = updateTs;
		this.deletedBy = deletedBy;
		this.deleteTs = deleteTs;
		this.isEditable = isEditable;
		this.isDeletable = isDeletable;
		this.plantId = plantId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AdsId", unique = true, nullable = false)
	public Long getAdsId() {
		return this.adsId;
	}

	public void setAdsId(Long adsId) {
		this.adsId = adsId;
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

	@Column(name = "EmpId")
	public Long getEmpId() {
		return this.empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date", length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "Amount", precision = 9)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "BalanceAmount", precision = 9)
	public Double getBalanceAmount() {
		return this.balanceAmount;
	}

	public void setBalanceAmount(Double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Column(name = "Complete")
	public Boolean getComplete() {
		return this.complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	@Column(name = "InsertedBy")
	public Long getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(Long insertedBy) {
		this.insertedBy = insertedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "InsertTs", length = 19)
	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	@Column(name = "UpdatedBy")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdateTs", length = 19)
	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	@Column(name = "DeletedBy")
	public Long getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DeleteTs", length = 19)
	public Date getDeleteTs() {
		return this.deleteTs;
	}

	public void setDeleteTs(Date deleteTs) {
		this.deleteTs = deleteTs;
	}

	@Column(name = "IsEditable")
	public Boolean getIsEditable() {
		return this.isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	@Column(name = "IsDeletable")
	public Boolean getIsDeletable() {
		return this.isDeletable;
	}

	public void setIsDeletable(Boolean isDeletable) {
		this.isDeletable = isDeletable;
	}

	@Column(name = "PlantId")
	public Integer getPlantId() {
		return this.plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

}