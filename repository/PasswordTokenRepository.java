/**
 * 
 */
package com.cts.cj.repository;

import java.io.Serializable;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.PasswordToken;

/**
 * @author Shikha.Mishra
 *
 */
public interface PasswordTokenRepository extends Neo4jRepository<PasswordToken, Serializable> {
		//@Query("select token from PasswordToken token where token.token=?1")
	@Query("match(p:PasswordToken) where p.token={0} return p")
		PasswordToken findByToken(String token);

	}
	
