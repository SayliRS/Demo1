package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SvTaskAssignemp generated by hbm2java
 */
@Entity
@Table(name = "sv_task_assignemp", catalog = "db_payroll")
public class SvTaskAssignemp implements java.io.Serializable {

	private Integer empTaskAssginId;
	private SvTaskMaster svTaskMaster;
	private Integer empId;

	public SvTaskAssignemp() {
	}

	public SvTaskAssignemp(SvTaskMaster svTaskMaster, Integer empId) {
		this.svTaskMaster = svTaskMaster;
		this.empId = empId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EmpTaskAssginId", unique = true, nullable = false)
	public Integer getEmpTaskAssginId() {
		return this.empTaskAssginId;
	}

	public void setEmpTaskAssginId(Integer empTaskAssginId) {
		this.empTaskAssginId = empTaskAssginId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TaskId")
	public SvTaskMaster getSvTaskMaster() {
		return this.svTaskMaster;
	}

	public void setSvTaskMaster(SvTaskMaster svTaskMaster) {
		this.svTaskMaster = svTaskMaster;
	}

	@Column(name = "EmpId")
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
