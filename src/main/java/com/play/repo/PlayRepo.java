package com.play.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.play.entity.PlayEntity;
import com.play.entity.UserRegister;

/**
 * 
 * @author Hemanth
 * 
 */
public abstract class PlayRepo {

  @PersistenceContext
  EntityManager entityManager;

  public void create(PlayEntity entity) {
    entityManager.persist(entity);
  }

  public List<? extends PlayEntity> find(Class<? extends PlayEntity> entity) {
    List<? extends PlayEntity> result =
        entityManager.createQuery("from " + entity.getSimpleName(), entity).getResultList();
    return result;
  }

  public PlayEntity find(Class<? extends PlayEntity> entity, Object primaryKey) {
    return entityManager.find(entity, primaryKey);
  }

  public PlayEntity update(PlayEntity updatedEntity) {
    PlayEntity entity = entityManager.find(updatedEntity.getClass(), updatedEntity.getId());
    return entity;
  }

  public void delete(PlayEntity deleteEntity) {
    PlayEntity entity = entityManager.find(UserRegister.class, deleteEntity.getId());
    entityManager.remove(entity);
  }

  public List<? extends PlayEntity> findByColumnName(Class<? extends PlayEntity> playEntity,
      String attribute, Object value) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<PlayEntity> criteria =
        (CriteriaQuery<PlayEntity>) builder.createQuery(playEntity);
    Root<? extends PlayEntity> playEntityRoot =
        (Root<? extends PlayEntity>) criteria.from(playEntity);
    // criteria.multiselect(playEntityRoot.get(playEntity.),
    // playEntityRoot.get(playEntity.VERSION));
    criteria.select(playEntityRoot);
    criteria.where(builder.equal(playEntityRoot.get(attribute), value));
    return entityManager.createQuery(criteria).getResultList();
  }

  public List<? extends PlayEntity> createCriteria(CriteriaQuery<? extends PlayEntity> criteria) {
    return entityManager.createQuery(criteria).getResultList();
  }

}
