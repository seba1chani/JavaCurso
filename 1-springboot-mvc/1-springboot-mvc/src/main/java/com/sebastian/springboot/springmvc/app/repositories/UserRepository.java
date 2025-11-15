package com.sebastian.springboot.springmvc.app.repositories;

import com.sebastian.springboot.springmvc.app.entities.User;
import org.springframework.data.repository.CrudRepository;

// no se agregan anotaciones xq ya estan en CrudRepository al ser de spring
public interface UserRepository extends CrudRepository<User, Long> {

}
