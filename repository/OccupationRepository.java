package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Occupation;

public interface OccupationRepository extends Neo4jRepository<Occupation, Serializable>{
	
	@Query("MATCH(o:Occupation) return o")
	public List<Occupation> getOccupationList();
	
	
	@Query("MATCH (o:Occupation) where o.name={0}")
	Occupation findByName(String name);
}
