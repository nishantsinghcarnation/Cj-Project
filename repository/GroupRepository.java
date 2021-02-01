package com.cts.cj.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Group;
import com.cts.cj.domain.User;


public interface GroupRepository extends Neo4jRepository<Group, Long>{
	
	 @Query("Match(b:Group) where id(b)={1} match(d:User) where id(d) in [{0}] MERGE(b) -[c:HAS_ASSOCIATED_MEMBER] ->(d)") 
	 void tagUsers(Long userIds,Long groupId);	
	 @Query("match(a:User) <- [b:HAS_ASSOCIATED_MEMBER] - (c:Group) where id(a)={0} and c.isDeleted=false match(d:User) where c.createdBy=id(d)   return c")
	 List<Group> getGroup(Long userId);
	// @Query("match(a:User) <- [b:HAS_ASSOCIATED_MEMBER] - (c:Group) -[e:HAS_ASSOCIATED_MEMBER] -> (f:User) where id(c)={0} and c.isDeleted=false match(d:User) where c.createdBy=id(d)   return f")
	 
	 @Query("match (c:Group) -[e:HAS_ASSOCIATED_MEMBER] -> (f:User) where ID(c)={0}   return f")
	 List<User> memberUserlist(Long groupId);
	 @Query("match(b:Group) where id(b)={0} create(c:EmailMesssage{Description:{1},createdDate:datetime()}), ({2}) -[d:HES_EMAIL_SENDER] ->(c),(b) <- [e:HAS_EMAIL_RECEIVER] -(c) ")
	 void createRelationship(Long groupId);
	 @Query("match(a:Group) where id(a)={0} set a.isDeleted=true return a")
	 Group deleteGroup(Long groupId);
	 @Query("match(a:User{email:{0}}) match(b:Group) where id(b)={1} create(c:EmailMesssage{Description:{2},createdDate:datetime()}), (a) -[d:HES_EMAIL_SENDER] ->(c),(b) <- [e:HAS_EMAIL_RECEIVER] -(c)")
	 void sendMessageToGroup(String senderEmail, Long groupId, String strMessage);
	 
	 @Query("Match(b:Group) where id(b)={1} match(d:User) where id(d) in [{0}] Match(b) -[c:HAS_ASSOCIATED_MEMBER] ->(d) delete c") 
	 void UntagUsers(Long userIds,Long groupId);	
}
