package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.User;

public interface DashBoardRepository extends Neo4jRepository<User, Serializable>{
	@Query(value = "MATCH (u:User)-[:REFFERED_BY]-(myMember:User)-[role:ROLE_TYPE]->(roles) WHERE ID(u) = {0} and roles.name= {1} RETURN myMember, roles,role")
	List<User> findMyMentorMenties(Long id,String  roleType);
		
	@Query(value = "MATCH (up:User)-[postExists:HAS_POST]-(p:Post) where ID(up)= {0}  return postExists,up,p")
	List<User> getAllPost(Long id);

}
