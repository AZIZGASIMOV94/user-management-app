package com.vabiss.dao.impl;

import com.vabiss.dao.inter.UserTableCustomRepository;
import com.vabiss.entity.UserTable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserTableCustomRepoImpl implements UserTableCustomRepository {
    @PersistenceContext
    EntityManager em;


    @Override
    public UserTable getById(int userId){
        UserTable user = em.find(UserTable.class, userId);
        return user;
    }
}
