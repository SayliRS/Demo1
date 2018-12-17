package com.custinfo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
@Entity
@Table(name="Login")
public class Login implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="Login",initialValue=150)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "custId")
	private Long custId;	// update3
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "passWord")
	private String passWord;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
