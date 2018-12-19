package com.custinfo.model;

// Generated 30 Aug, 2016 5:25:50 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SettingRules generated by hbm2java
 */
@Entity
@Table(name = "setting_rules", catalog = "db_payroll")
public class SettingRules implements java.io.Serializable {

	private Integer ruleId;
	private String key;
	private BigDecimal value;
	private String comment;

	public SettingRules() {
	}

	public SettingRules(String key, BigDecimal value) {
		this.key = key;
		this.value = value;
	}

	public SettingRules(String key, BigDecimal value, String comment) {
		this.key = key;
		this.value = value;
		this.comment = comment;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RuleId", unique = true, nullable = false)
	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	@Column(name = "Key", nullable = false, length = 45)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "Value", nullable = false, precision = 9, scale = 3)
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Column(name = "Comment", length = 45)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}