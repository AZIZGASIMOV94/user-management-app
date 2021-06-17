package com.vabiss.dao.inter;


import com.vabiss.entity.UserTable;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTableCustomRepository {

    UserTable getById(int id);
}
