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
 * AttendanceMain generated by hbm2java
 */
@Entity
@Table(name = "attendance_main", catalog = "db_payroll", uniqueConstraints = @UniqueConstraint(columnNames = {
		"EmpId", "Date_In" }))
public class AttendanceMain implements java.io.Serializable {

	private Long attendanceId;
	private Integer empId;
	private Date dateIn;
	private Date inTime;
	private Date dateOut;
	private Date outTime;
	private String status;
	private Double workedHrs;
	private String shiftHrs;
	private Double ot;
	private Double lessHr;
	private Double extraAmount;
	private Double lessAmount;
	private String pendingStatus;
	private String grandTotal;
	private Long shiftId;

	public AttendanceMain() {
	}

	public AttendanceMain(Integer empId, Date dateIn, Date inTime,
			Date dateOut, Date outTime, String status, Double workedHrs,
			String shiftHrs, Double ot, Double lessHr, Double extraAmount,
			Double lessAmount, String pendingStatus, String grandTotal,
			Long shiftId) {
		this.empId = empId;
		this.dateIn = dateIn;
		this.inTime = inTime;
		this.dateOut = dateOut;
		this.outTime = outTime;
		this.status = status;
		this.workedHrs = workedHrs;
		this.shiftHrs = shiftHrs;
		this.ot = ot;
		this.lessHr = lessHr;
		this.extraAmount = extraAmount;
		this.lessAmount = lessAmount;
		this.pendingStatus = pendingStatus;
		this.grandTotal = grandTotal;
		this.shiftId = shiftId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Attendance_Id", unique = true, nullable = false)
	public Long getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}

	@Column(name = "EmpId")
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date_In", length = 10)
	public Date getDateIn() {
		return this.dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "In_Time", length = 8)
	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date_Out", length = 10)
	public Date getDateOut() {
		return this.dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Out_Time", length = 8)
	public Date getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	@Column(name = "Status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "Worked_Hrs", precision = 9)
	public Double getWorkedHrs() {
		return this.workedHrs;
	}

	public void setWorkedHrs(Double workedHrs) {
		this.workedHrs = workedHrs;
	}

	@Column(name = "Shift_Hrs", length = 45)
	public String getShiftHrs() {
		return this.shiftHrs;
	}

	public void setShiftHrs(String shiftHrs) {
		this.shiftHrs = shiftHrs;
	}

	@Column(name = "OT", precision = 9)
	public Double getOt() {
		return this.ot;
	}

	public void setOt(Double ot) {
		this.ot = ot;
	}

	@Column(name = "Less_Hr", precision = 9)
	public Double getLessHr() {
		return this.lessHr;
	}

	public void setLessHr(Double lessHr) {
		this.lessHr = lessHr;
	}

	@Column(name = "Extra_Amount", precision = 9)
	public Double getExtraAmount() {
		return this.extraAmount;
	}

	public void setExtraAmount(Double extraAmount) {
		this.extraAmount = extraAmount;
	}

	@Column(name = "Less_Amount", precision = 9)
	public Double getLessAmount() {
		return this.lessAmount;
	}

	public void setLessAmount(Double lessAmount) {
		this.lessAmount = lessAmount;
	}

	@Column(name = "Pending_Status", length = 10)
	public String getPendingStatus() {
		return this.pendingStatus;
	}

	public void setPendingStatus(String pendingStatus) {
		this.pendingStatus = pendingStatus;
	}

	@Column(name = "Grand_Total", length = 45)
	public String getGrandTotal() {
		return this.grandTotal;
	}

	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Column(name = "Shift_Id")
	public Long getShiftId() {
		return this.shiftId;
	}

	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}

}
