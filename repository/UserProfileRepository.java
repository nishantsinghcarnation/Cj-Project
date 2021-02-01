package com.cts.cj.repository;

import java.io.Serializable;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.UserProfile;

public interface UserProfileRepository extends Neo4jRepository<UserProfile, Serializable>{
	
	@Query("MATCH (u:User)-[p:HAS_PROFILE]->(userProfile) where ID(u)={0} OPTIONAL MATCH (userProfile)-[a:HAS_CONTACT_DETAILS]->(address) OPTIONAL MATCH (userProfile)-[i:HAS_IDENTITY]->(identityDetails) OPTIONAL MATCH (userProfile)-[o:HAS_OCCUPATION]->(occupations) RETURN u,userProfile,p.userId,a,i,o,address,identityDetails,occupations")
		
	public UserProfile getUserProfile(Long userId);

}
