package com.cts.cj.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.EmailMessage;

public interface MessageRepository extends Neo4jRepository<EmailMessage, Long>{
	
	@Query("MATCH (u:User)-[message:HAS_EMAIL_MESSAGE]->(emailMessege)  where emailMessege.emailsendStatus='PENDING' OR  emailMessege.emailsendStatus='FAILED' RETURN  emailMessege")
	List<EmailMessage> getMessage();

}
