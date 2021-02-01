package com.cts.cj.repository;

import java.io.Serializable;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.PostPrevious;

public interface PostPreviousRepository extends Neo4jRepository<PostPrevious, Serializable> {
	

	@Query("MATCH (a:User),(b:User)\r\n" + 	"WHERE ID(a) ={0}  AND ID(b) ={1}\r\n" + 
			"CREATE (a)-[r:SHARED_WITH]->(b)\r\n" + "RETURN type(r)")
	PostPrevious sharedWith(Long parentid , Long childid);

}
