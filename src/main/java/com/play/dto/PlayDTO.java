package com.play.dto;

import java.io.Serializable;

/**
 * 
 * @author Hemanth
 * 
 */

public abstract class PlayDTO implements Serializable {

  private static final long serialVersionUID = 910674621037840034L;
  
  public long id;

  public long getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
