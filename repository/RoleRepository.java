package com.cts.cj.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Role;

public interface RoleRepository extends Neo4jRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);
    
    @Query("MATCH (u:Role) where u.id={0}  return u")
    Role findByRole(Role roletype);
}
