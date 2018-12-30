package com.play.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the user_register database table.
 * 
 */
@Entity
@Table(name = "user_register")
@NamedQuery(name = "UserRegister.findAll", query = "SELECT u FROM UserRegister u")
public class UserRegister extends PlayEntity {
  private static final long serialVersionUID = 1L;

  private String userid;

  private String password;

  private String email;

  private String firstname;

  private String lastname;

  private int status;

  private List<UserRole> userRole;

  private Timestamp timestamp;

  public UserRegister() {}

  public String getFirstname() {
    return this.firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return this.lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Column(nullable = false)
  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getStatus() {
    return this.status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegister")
  public List<UserRole> getUserRole() {
    return userRole;
  }

  public void setUserRole(List<UserRole> userRole) {
    this.userRole = userRole;
  }

  public Timestamp getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public String getUserid() {
    return this.userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  @Override
  public String toString() {
    return "UserRegister - " + "{ id: " + this.getId() + ", userid: " + this.getUserid()
        + ", email: " + this.getEmail() + ", firstname: " + this.getFirstname() + ", lastname: "
        + this.getLastname() + ", status: " + this.getStatus() + ", Role: " + this.getUserRole()
        + ", timestamp: " + this.getTimestamp() + " }";
  }

}
