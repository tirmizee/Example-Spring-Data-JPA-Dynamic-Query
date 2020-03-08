package com.tirmizee.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the ROLE database table.
 * 
 */
@Data
@Entity
@NoArgsConstructor
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
@Table(name = "ROLE")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private Long roleId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="ROLE_CODE")
	private String roleCode;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@OneToMany
	private List<User> users;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ROLE_MAP_PERMISSION", 
		joinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", nullable = false)},
		inverseJoinColumns = { @JoinColumn(name = "PER_ID", referencedColumnName = "PER_ID", nullable = false)})
	private Set<Permission> permissions;

	public User addUser(User user) {
		getUsers().add(user);
		user.setRole(this);
		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setRole(null);
		return user;
	}

}