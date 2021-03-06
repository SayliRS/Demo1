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

/**
 * SalarySlipCasualEmp generated by hbm2java
 */
@Entity
@Table(name = "salary_slip_casual_emp", catalog = "db_payroll", uniqueConstraints = @UniqueConstraint(columnNames = {
		"EmpId", "Month", "Year" }))
public class SalarySlipCasualEmp implements java.io.Serializable {

	private Long salCasualId;
	private Long empId;
	private String empName;
	private Integer month;
	private Integer year;
	private Double hourlySalary;
	private Double overTimeWage;
	private Double workedHours;
	private Double othours;
	private Double totalWorkedAmount;
	private Double totalOtamount;
	private Double totalAllowance;
	private Double grossSalary;
	private Double totalDeduction;
	private Double totalPayable;
	private Long insertedBy;
	private Date insertTs;
	private Long updatedBy;
	private Date updateTs;
	private Long deletedBy;
	private Date deleteTs;
	private Long plantId;

	public SalarySlipCasualEmp() {
	}

	public SalarySlipCasualEmp(Long empId, String empName, Integer month,
			Integer year, Double hourlySalary, Double overTimeWage,
			Double workedHours, Double othours, Double totalWorkedAmount,
			Double totalOtamount, Double totalAllowance, Double grossSalary,
			Double totalDeduction, Double totalPayable, Long insertedBy,
			Date insertTs, Long updatedBy, Date updateTs, Long deletedBy,
			Date deleteTs, Long plantId) {
		this.empId = empId;
		this.empName = empName;
		this.month = month;
		this.year = year;
		this.hourlySalary = hourlySalary;
		this.overTimeWage = overTimeWage;
		this.workedHours = workedHours;
		this.othours = othours;
		this.totalWorkedAmount = totalWorkedAmount;
		this.totalOtamount = totalOtamount;
		this.totalAllowance = totalAllowance;
		this.grossSalary = grossSalary;
		this.totalDeduction = totalDeduction;
		this.totalPayable = totalPayable;
		this.insertedBy = insertedBy;
		this.insertTs = insertTs;
		this.updatedBy = updatedBy;
		this.updateTs = updateTs;
		this.deletedBy = deletedBy;
		this.deleteTs = deleteTs;
		this.plantId = plantId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SalCasualId", unique = true, nullable = false)
	public Long getSalCasualId() {
		return this.salCasualId;
	}

	public void setSalCasualId(Long salCasualId) {
		this.salCasualId = salCasualId;
	}

	@Column(name = "EmpId")
	public Long getEmpId() {
		return this.empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Column(name = "EmpName", length = 150)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(name = "Month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "Year")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Column(name = "HourlySalary", precision = 9)
	public Double getHourlySalary() {
		return this.hourlySalary;
	}

	public void setHourlySalary(Double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	@Column(name = "OverTimeWage", precision = 9)
	public Double getOverTimeWage() {
		return this.overTimeWage;
	}

	public void setOverTimeWage(Double overTimeWage) {
		this.overTimeWage = overTimeWage;
	}

	@Column(name = "WorkedHours", precision = 9)
	public Double getWorkedHours() {
		return this.workedHours;
	}

	public void setWorkedHours(Double workedHours) {
		this.workedHours = workedHours;
	}

	@Column(name = "OTHours", precision = 9)
	public Double getOthours() {
		return this.othours;
	}

	public void setOthours(Double othours) {
		this.othours = othours;
	}

	@Column(name = "TotalWorkedAmount", precision = 9)
	public Double getTotalWorkedAmount() {
		return this.totalWorkedAmount;
	}

	public void setTotalWorkedAmount(Double totalWorkedAmount) {
		this.totalWorkedAmount = totalWorkedAmount;
	}

	@Column(name = "TotalOTAmount", precision = 9)
	public Double getTotalOtamount() {
		return this.totalOtamount;
	}

	public void setTotalOtamount(Double totalOtamount) {
		this.totalOtamount = totalOtamount;
	}

	@Column(name = "TotalAllowance", precision = 9)
	public Double getTotalAllowance() {
		return this.totalAllowance;
	}

	public void setTotalAllowance(Double totalAllowance) {
		this.totalAllowance = totalAllowance;
	}

	@Column(name = "GrossSalary", precision = 9)
	public Double getGrossSalary() {
		return this.grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Column(name = "TotalDeduction", precision = 9)
	public Double getTotalDeduction() {
		return this.totalDeduction;
	}

	public void setTotalDeduction(Double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	@Column(name = "TotalPayable", precision = 9)
	public Double getTotalPayable() {
		return this.totalPayable;
	}

	public void setTotalPayable(Double totalPayable) {
		this.totalPayable = totalPayable;
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

	@Column(name = "PlantId")
	public Long getPlantId() {
		return this.plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

}
