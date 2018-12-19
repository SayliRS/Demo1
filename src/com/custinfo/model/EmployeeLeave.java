package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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

/**
 * EmployeeLeave generated by hbm2java
 */
@Entity
@Table(name = "employee_leave", catalog = "db_payroll", uniqueConstraints = @UniqueConstraint(columnNames = {
		"EmpId", "FromDate", "ToDate" }))
public class EmployeeLeave implements java.io.Serializable {

	private Integer leaveId;
	private int empId;
	private Date fromDate;
	private Date toDate;
	private BigDecimal days;
	private String leaveType;
	private String leaveDay;
	private String isPaidLeave;
	private String leaveApproveBy;
	private String lastModifiedBy;
	private Date lastModifiedDate;
	private String note;
	private Integer plantId;
	private Integer insertedBy;
	private Date insertTs;
	private Integer updatedBy;
	private Date updateTs;
	private Integer deletedBy;
	private Date deleteTs;
	private Boolean isDeleted;

	public EmployeeLeave() {
	}

	public EmployeeLeave(int empId, Date fromDate, Date toDate,
			Date lastModifiedDate) {
		this.empId = empId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public EmployeeLeave(int empId, Date fromDate, Date toDate,
			BigDecimal days, String leaveType, String leaveDay,
			String isPaidLeave, String leaveApproveBy, String lastModifiedBy,
			Date lastModifiedDate, String note, Integer plantId,
			Integer insertedBy, Date insertTs, Integer updatedBy,
			Date updateTs, Integer deletedBy, Date deleteTs, Boolean isDeleted) {
		this.empId = empId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.days = days;
		this.leaveType = leaveType;
		this.leaveDay = leaveDay;
		this.isPaidLeave = isPaidLeave;
		this.leaveApproveBy = leaveApproveBy;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.note = note;
		this.plantId = plantId;
		this.insertedBy = insertedBy;
		this.insertTs = insertTs;
		this.updatedBy = updatedBy;
		this.updateTs = updateTs;
		this.deletedBy = deletedBy;
		this.deleteTs = deleteTs;
		this.isDeleted = isDeleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LeaveId", unique = true, nullable = false)
	public Integer getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	@Column(name = "EmpId", nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FromDate", nullable = false, length = 10)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ToDate", nullable = false, length = 10)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Column(name = "Days", precision = 9)
	public BigDecimal getDays() {
		return this.days;
	}

	public void setDays(BigDecimal days) {
		this.days = days;
	}

	@Column(name = "LeaveType", length = 45)
	public String getLeaveType() {
		return this.leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	@Column(name = "LeaveDay", length = 45)
	public String getLeaveDay() {
		return this.leaveDay;
	}

	public void setLeaveDay(String leaveDay) {
		this.leaveDay = leaveDay;
	}

	@Column(name = "IsPaidLeave", length = 10)
	public String getIsPaidLeave() {
		return this.isPaidLeave;
	}

	public void setIsPaidLeave(String isPaidLeave) {
		this.isPaidLeave = isPaidLeave;
	}

	@Column(name = "LeaveApproveBy", length = 100)
	public String getLeaveApproveBy() {
		return this.leaveApproveBy;
	}

	public void setLeaveApproveBy(String leaveApproveBy) {
		this.leaveApproveBy = leaveApproveBy;
	}

	@Column(name = "LastModifiedBy", length = 45)
	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastModifiedDate", nullable = false, length = 19)
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Column(name = "Note", length = 100)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "PlantId")
	public Integer getPlantId() {
		return this.plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	@Column(name = "InsertedBy")
	public Integer getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(Integer insertedBy) {
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
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
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
	public Integer getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(Integer deletedBy) {
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

	@Column(name = "IsDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}