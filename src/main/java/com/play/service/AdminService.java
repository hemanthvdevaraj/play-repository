package com.play.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.play.dto.UserRegisterDTO;
import com.play.entity.UserRegister;
import com.play.repo.UserRegisterRepo;

@Service
@Transactional
public class AdminService {

  static final Logger logger = Logger.getLogger(AdminService.class);

  @Autowired
  UserRegisterRepo userRegisterRepo;

  public void create(UserRegisterDTO newUserDTO) {

    UserRegister newUser = new UserRegister();
    newUser.setUserid(newUserDTO.getUserid());
    newUser.setPassword(newUserDTO.getPassword());
    newUser.setEmail(newUserDTO.getEmail());
    newUser.setFirstname(newUserDTO.getFirstname());
    newUser.setLastname(newUserDTO.getLastname());
    newUser.setStatus(newUserDTO.getStatus());

    userRegisterRepo.create(newUser);
  }

}
