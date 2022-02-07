package org.lsi.repositories;

import java.util.Optional;

import org.lsi.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
      public Optional<User> findById(String id);
      public Optional<User> findByUsername(String username);
}
