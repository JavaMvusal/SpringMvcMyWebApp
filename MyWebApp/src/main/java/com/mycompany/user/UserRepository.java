package com.mycompany.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User,Integer> {
public Long countById(Integer id);
}
