package com.play.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Table(name = "user_details")
public class UserDetail extends PlayEntity {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(unique = true, nullable = false)
  private int id;

  @Column(nullable = false, length = 50)
  private String address;

  @Column(nullable = false, length = 30)
  private String name;

  @Column(nullable = false, length = 20)
  private String phone;

  public UserDetail() {}

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
