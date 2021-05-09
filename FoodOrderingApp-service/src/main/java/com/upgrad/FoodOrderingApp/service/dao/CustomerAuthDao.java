package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.CustomerAuthEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

// This Class is created to access DB with respect to CustomerAuth Entity

@Repository
public class CustomerAuthDao {
  @Autowired EntityManager entityManager;

  public CustomerAuthEntity getCustomerByToken(String accessToken) {
    try {
      return entityManager
          .createNamedQuery("customerAuthByAccessToken", CustomerAuthEntity.class)
          .setParameter("accessToken", accessToken)
          .getSingleResult();
    } catch (NoResultException nre) {
      return null;
    }
  }

  public CustomerAuthEntity getCustomerAuthByAccessToken(String accessToken) {
    try {
      return entityManager
          .createNamedQuery("customerAuthByAccessToken", CustomerAuthEntity.class)
          .setParameter("accessToken", accessToken)
          .getSingleResult();
    } catch (NoResultException nre) {
      return null;
    }
  }

  public CustomerAuthEntity getCustomerById(Integer customer_id) {
    try {
      return entityManager
          .createNamedQuery("customerAuthByCustomerId", CustomerAuthEntity.class)
          .setParameter("customesr_id", customer_id)
          .getSingleResult();
    } catch (NoResultException nre) {
      return null;
    }
  }
}
