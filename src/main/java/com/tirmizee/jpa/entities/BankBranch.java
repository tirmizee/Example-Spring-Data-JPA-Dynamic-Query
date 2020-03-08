package com.tirmizee.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the BANK_BRANCH database table.
 * 
 */

@Data
@Entity
@Table(name="BANK_BRANCH")
@NamedQuery(name="BankBranch.findAll", query="SELECT b FROM BankBranch b")
public class BankBranch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BRANCH_ID")
	private long branchId;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="BRANCH_NAME_EN")
	private String branchNameEn;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="IS_BANK_BRANCH")
	private String isBankBranch;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

}