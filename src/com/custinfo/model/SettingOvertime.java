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

/**
 * SettingOvertime generated by hbm2java
 */
@Entity
@Table(name = "setting_overtime", catalog = "db_payroll")
public class SettingOvertime implements java.io.Serializable {

	private Integer otsid;
	private Integer onOff;
	private Long modifiedBy;
	private Date modifiedTs;

	public SettingOvertime() {
	}

	public SettingOvertime(Integer onOff, Long modifiedBy, Date modifiedTs) {
		this.onOff = onOff;
		this.modifiedBy = modifiedBy;
		this.modifiedTs = modifiedTs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "OTSId", unique = true, nullable = false)
	public Integer getOtsid() {
		return this.otsid;
	}

	public void setOtsid(Integer otsid) {
		this.otsid = otsid;
	}

	@Column(name = "OnOff")
	public Integer getOnOff() {
		return this.onOff;
	}

	public void setOnOff(Integer onOff) {
		this.onOff = onOff;
	}

	@Column(name = "ModifiedBy")
	public Long getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ModifiedTs", length = 19)
	public Date getModifiedTs() {
		return this.modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

}
