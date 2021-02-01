package com.cts.cj.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.ProfessionType;

public interface ProfessionRepository extends Neo4jRepository<ProfessionType, Long>{
	
	@Query("MATCH(u:ProfessionType) return u")
	public List<ProfessionType> getProfessionList();
	
	@Query("MATCH(u:ProfessionType) where ID(u)={0} return u")
	public ProfessionType getProfessionById(Long Id);

}
