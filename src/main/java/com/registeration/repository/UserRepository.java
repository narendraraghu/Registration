package com.registeration.repository;
import com.registeration.pojo.RegisterUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nara1016 on 12-04-2017.
 */
public interface UserRepository extends CrudRepository<RegisterUser, Integer> {

}
