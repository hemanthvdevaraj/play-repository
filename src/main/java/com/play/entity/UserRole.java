package com.play.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole extends PlayEntity {
  private static final long serialVersionUID = 1L;

//  private Long userid;

  private String role;

  private UserRegister userRegister;

//  @Column(name = "user_id", nullable = false)
//  public Long getUserid() {
//    return userid;
//  }
//
//  public void setUserid(Long userid) {
//    this.userid = userid;
//  }

  @Column(name = "role", nullable = false)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id", insertable = false, updatable = false)
  public UserRegister getUserRegister() {
    return userRegister;
  }

  public void setUserRegister(UserRegister userRegister) {
    this.userRegister = userRegister;
  }
}
