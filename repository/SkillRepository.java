package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Skill;

public interface SkillRepository extends Neo4jRepository<Skill, Serializable>{
	
	@Query("MATCH(s:Skill) return s")
	public List<Skill> getSkillList();
	
	@Query("MATCH (s:Skill {SkillName: {0}})-[r:HAS_SKILL]-(skills)	RETURN s")
	Skill getRelationShip(String name);
	
	@Query("MATCH(s:Skill) where s.SkillName =~ {0} return s")
	public List<Skill> serachSkillList(String name);
	
}
