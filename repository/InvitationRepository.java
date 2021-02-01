package com.cts.cj.repository;

import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Invitaition;
import com.cts.cj.domain.User;

public interface InvitationRepository  extends Neo4jRepository<Invitaition, Long>{
	
	@Query("MATCH (u:Invitaition) where u.email={0} and u.status='Pending'" + 
			"RETURN u")
	Optional<Invitaition> findInvitationCodeByEmail(String username);

}
