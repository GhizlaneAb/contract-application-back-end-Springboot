package org.lsi.repositories;

import java.util.Optional;

import org.lsi.entities.ERole;
import org.lsi.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
