package com.cts.cj.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Privilege;

public interface PrivilegeRepository extends Neo4jRepository<Privilege, Long>{

    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);
}
