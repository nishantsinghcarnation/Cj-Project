package com.cts.cj.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.User;


public interface RegistorRepository   extends Neo4jRepository<User, Long>{
	
	@Query("MATCH (n:User) where n.emailId={0} and n.mobileNumber={1} and n.name={2} return n")
	User getExistingUser(String email,String mobile,String name);
	
	
	@Query("Match(s) where id(s) ={0} return s")
	User getExistingUserbyId(long id);

    @Query("Match(s) where id(s) ={0} return s")
	User findByName(String name);

}
