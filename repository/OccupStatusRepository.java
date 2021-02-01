package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.OccupationStaus;

public interface OccupStatusRepository extends Neo4jRepository<OccupationStaus, Serializable>{
	
	@Query("MATCH(s:OccupationStaus) return s")
	public List<OccupationStaus> getstatusList();
	
	@Query("MATCH (o:OccupationStaus) where o.name={0}")
	OccupationStaus findByName(String name);

}
