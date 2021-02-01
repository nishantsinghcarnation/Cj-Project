package com.cts.cj.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Prospect;

public interface ProspectRepository extends Neo4jRepository<Prospect, Long>{

}
