/**
 * 
 */
package com.cts.cj.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Comment;

/**
 * @author Shikha.Mishra
 *
 */
public interface CommentRepository extends Neo4jRepository<Comment, Long>{

	@Query("match(u:User) where ID(u)={0} Match(c:Comment) where ID(c)={1} Match (p:Post) where Id(p)= {2} create (u)-[e:HAS_POST_COMMENT]->(c)-[d:HAS_ASSOCIATE]->(p) return  u, c, p")
	  void relationOfPostAndComment(Long userId, Long commentId, Long postId);
	
	@Query("match(a:Comment) where id(a)={0} match(b:CommentUrl) where id(b) in [{1}] create(a) -[e:HAS_ASSOCIATED_URL] ->(b)")
	void createHasAssociatedUrlRelationship(Long commentId, Long[] commentUrlIds);
}
