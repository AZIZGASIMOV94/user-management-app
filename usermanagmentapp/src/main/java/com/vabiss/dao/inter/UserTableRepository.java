package com.vabiss.dao.inter;


import com.vabiss.entity.UserTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTableRepository extends CrudRepository<UserTable, Integer> {
    UserTable findByUsername(String username);
}
