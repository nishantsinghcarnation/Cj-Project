/**
 * 
 */
package com.cts.cj.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Post;
import com.cts.cj.domain.User;

/**
 * @author Shikha.Mishra
 *
 */
public interface PostRepository extends Neo4jRepository<Post, Long>{
	
	@Query("match(a:Post) where id(a)={0} match(b:PostUrl) where id(b) in [{1}] create(a) -[e:HAS_ASSOCIATED_URL] ->(b)")
	void createHasAssociatedUrlRelationship(Long postId, Long[] postUrlId);
  
	
	  @Query("match(a:Post) where id(a)={0} match(d:Group) where id(d)={1} create (a)-[g:POST_RECEIVED_BY]->(d)") 
	  void createReceiverRelationship(Long postId, Long  groupId);
	  
	  @Query("match(a:Post) where id(a)={0} match(c:User) where id(c)={1}  create (c)-[f:POST_CREATED_BY]->(a)"
			  ) void createSenderRelationship(Long postId,Long userId);
	  
	 // @Query("match(a:Post) <- [b:POST_CREATED_BY] - (c:User) where id(c)=711 and a.isDeleted=false and a.isPrivate=true  optional match(a:Post) - [d:HAS_ASSOCIATED_URL] -> (e:PostUrl)    return a")
		// List<Post> getPostBySender(Long userId);
	  
	/*
	 * @Query("match(a:Post) <- [b:POST_CREATED_BY] - (c:User) where id(c)={0} and a.isDeleted=false and a.isPrivate=true  optional match(a:Post) - [d:HAS_ASSOCIATED_URL] -> (e:PostUrl)  set a.createdBy=id(c)  return a,e"
	 * ) List<Post> getPostBySender(Long userId);
	 */

	/*
	 * @Query("match(a:Post)  - [b:POST_RECEIVED_BY] -> (c:Group) - [d:HAS_ASSOCIATED_MEMBER] -> (e:User)  where id(e)={0} and a.isDeleted=false and a.isPrivate=true match(a:Post) <- [h:POST_CREATED_BY] -(i:User) optional match(a:Post) - [g:HAS_ASSOCIATED_URL] -> (f:PostUrl) set a.createdBy=id(i)  return a,f,i"
	 * ) List<Post> getPostByReceiver(Long userId);
	 */
	  @Query("match (n:Post) where n.isPrivate=false and n.isDeleted=false match(n:Post) <- [p:POST_CREATED_BY] - (q:User)  optional match(n:Post) - [m:HAS_ASSOCIATED_URL] -> (o:PostUrl)  return n,o,q")
	  List<Post> getPublicPost();
	  @Query("match(a:Post)<-[f:POST_CREATED_BY]-(c:User) where id(a)={0} return c,a")
	  List<User> getCreatedByUser(Long postId);
	  
	  @Query("Match(a:Post) where id(a)={0} match(d:User) where id(d)={1} create (a)-[g:POST_RECEIVED_BY_USER]->(d) return a") 
	  Post createTaggedUserRelationship(Long postId, Long taggedUsers);
	  
}
