package com.registeration.repository;
import org.springframework.data.repository.CrudRepository;
import  com.registeration.pojo.User;
/**
 * Created by nara1016 on 12-04-2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
