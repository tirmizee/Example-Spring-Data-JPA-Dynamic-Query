package com.tirmizee.jpa.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Data
@Entity
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private Long userId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_EXPIRED_DATE")
	private Date accountExpiredDate;

	@Column(name="ACCOUNT_LOCKED_DATE")
	private Timestamp accountLockedDate;

	private Boolean accountNonExpired;

	private Boolean accountNonLocked;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDENTIALS_EXPIRED_DATE")
	private Date credentialsexpiredDate;

	private Boolean credentialsNonExpired;

	private Boolean enabled;

	@Column(name="FIRST_LOGIN")
	private Boolean firstLogin;

	@Column(name="MAX_SESSION")
	private Boolean maxSession;

	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	private String username;
	
	@Column(name="FK_ROLE_ID" ,insertable = false, updatable = false)
	private Long fkRoleId;
	
	@Column(name="PROFILE_ID" ,insertable = false, updatable = false)
	private Long profileId;

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PROFILE_ID",foreignKey = @ForeignKey(name = "FK_PROFILE_ID"))
	private Profile profile;

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_ROLE_ID", foreignKey = @ForeignKey(name = "FK_ROLE_ID"))
	private Role role;

}