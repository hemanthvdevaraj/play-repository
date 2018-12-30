package com.play.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PlayEntity implements Serializable {

  private static final long serialVersionUID = 6875270815708243866L;

  private Long id;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
