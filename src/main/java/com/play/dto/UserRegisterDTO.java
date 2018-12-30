package com.play.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserRegisterDTO extends PlayDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  public String userid;

  public String password;

  public String email;

  public String firstname;

  public String lastname;

  public int status;

  public Timestamp timestamp;

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
    return "UserRegisterDTO - "
        + "{ id: " + this.getId()
        + ", userid: " + this.getUserid()
        + ", email: " + this.getEmail()
        + ", firstname: " + this.getFirstname()
        + ", lastname: " + this.getLastname()
        + ", status: " + this.getStatus()
        + ", timestamp: " + this.getTimestamp() + " }";
  }

}
