package com.play.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.play.service.PlayService;

/**
 * 
 * @author Insignia
 * 
 */
@Component
public class PlayRepository {

  @Autowired
  EntityManagerFactory entityManagerFactory;

  @PersistenceContext
  EntityManager entityManager;

  public PlayRepository() {
    EntityManagerFactory entityManagerFactory =
        Persistence.createEntityManagerFactory("Play_HibernateUnit");
    entityManager = entityManagerFactory.createEntityManager();
  }

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("repository-springContext.xml");
    PlayService playService = ctx.getBean(PlayService.class);
     playService.create();
    // playService.update();
    // playService.delete();
//    playService.find();
    // playService.findByField();
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
