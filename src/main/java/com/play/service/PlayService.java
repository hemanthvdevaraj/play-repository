package com.play.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.play.entity.UserRegister;
import com.play.repo.UserRegisterRepo;

@Service
@Transactional
public class PlayService {

  static final Logger logger = Logger.getLogger(PlayService.class);

  @Autowired
  UserRegisterRepo userRegisterRepo;

  public void create() {
    // entityManager.getTransaction().begin();
    UserRegister userReg = new UserRegister();
    userReg.setUserid("admin2");
    userReg.setPassword("admin2");
    userReg.setEmail("admin2@email.com");
    userReg.setFirstname("admin2");
    userReg.setLastname("admin2");
    userRegisterRepo.create(userReg);
    // entityManager.persist(entity);
    // entityManager.getTransaction().commit();
    // entityManager.close();
  }

  @SuppressWarnings("unchecked")
  public void find() {
    List<UserRegister> result = (List<UserRegister>) userRegisterRepo.find(UserRegister.class);
    for (UserRegister userRegister : result) {
      logger.debug(userRegister);
    }
  }

  public void findbyId() {
    UserRegister result = (UserRegister) userRegisterRepo.find(UserRegister.class, 2L);
    logger.debug(result);
  }

  public void update() {
    UserRegister userReg = new UserRegister();
    userReg.setId(1L);
    UserRegister updateObj = (UserRegister) userRegisterRepo.update(userReg);
    updateObj.setUserid("root");
  }

  public void delete() {
    UserRegister userReg = new UserRegister();
    userReg.setId(4L);
    userRegisterRepo.delete(userReg);
  }

  @SuppressWarnings("unchecked")
  public void findByField() {
    List<UserRegister> userRegister = (List<UserRegister>) (List<?>) userRegisterRepo
        .findByColumnName(UserRegister.class, "userid", "root");
    if (!userRegister.isEmpty()) {
      logger.debug(userRegister.get(0));
    } else {
      System.out.println("no data");
    }
  }
}
