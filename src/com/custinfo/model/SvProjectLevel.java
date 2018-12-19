package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SvProjectLevel generated by hbm2java
 */
@Entity
@Table(name = "sv_project_level", catalog = "db_payroll")
public class SvProjectLevel implements java.io.Serializable {

	private Integer projectLevelId;
	private SvProjectMaster svProjectMaster;
	private Integer clientId;
	private Integer parentLevelId;
	private String levelName;
	private Integer createdBy;
	private Date createdOn;
	private Integer updatedBy;
	private Date updatedOn;
	private Integer deletedBy;
	private Date deletedOn;
	private Boolean isDeleted;

	public SvProjectLevel() {
	}

	public SvProjectLevel(SvProjectMaster svProjectMaster, Integer clientId,
			Integer parentLevelId, String levelName, Integer createdBy,
			Date createdOn, Integer updatedBy, Date updatedOn,
			Integer deletedBy, Date deletedOn, Boolean isDeleted) {
		this.svProjectMaster = svProjectMaster;
		this.clientId = clientId;
		this.parentLevelId = parentLevelId;
		this.levelName = levelName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deletedBy = deletedBy;
		this.deletedOn = deletedOn;
		this.isDeleted = isDeleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ProjectLevelId", unique = true, nullable = false)
	public Integer getProjectLevelId() {
		return this.projectLevelId;
	}

	public void setProjectLevelId(Integer projectLevelId) {
		this.projectLevelId = projectLevelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProjectId")
	public SvProjectMaster getSvProjectMaster() {
		return this.svProjectMaster;
	}

	public void setSvProjectMaster(SvProjectMaster svProjectMaster) {
		this.svProjectMaster = svProjectMaster;
	}

	@Column(name = "ClientId")
	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	@Column(name = "ParentLevelId")
	public Integer getParentLevelId() {
		return this.parentLevelId;
	}

	public void setParentLevelId(Integer parentLevelId) {
		this.parentLevelId = parentLevelId;
	}

	@Column(name = "LevelName", length = 45)
	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Column(name = "CreatedBy")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "UpdatedBy")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdatedOn", length = 19)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name = "DeletedBy")
	public Integer getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(Integer deletedBy) {
		this.deletedBy = deletedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DeletedOn", length = 19)
	public Date getDeletedOn() {
		return this.deletedOn;
	}

	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}

	@Column(name = "IsDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}