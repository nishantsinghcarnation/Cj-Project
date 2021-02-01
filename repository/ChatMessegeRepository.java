package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.ChatMessege;
import com.cts.cj.domain.User;

public interface ChatMessegeRepository extends Neo4jRepository<ChatMessege, Serializable> {
	
	@Query(value = "MATCH (u:User)-[:REFFERED_BY]-(myMembers:User) where ID(u)= {0}  RETURN myMembers")
	List<User> findAllFriend(Long id);
	
	@Query(value = "MATCH(m:ChatMessege) where ((m.recieverId = {0} and m.senderId = {1}) or (m.recieverId = {1} and m.senderId = {0})) and m.created <= {2} return m ")
	List<ChatMessege> findMessageByUser(Long toUserId,Long fromUserId,String timeStr, Pageable pageable);
  
	@Query(value = "MATCH(m:ChatMessege) where ((m.recieverId = {0} and m.senderId = {1}) or (m.recieverId = {1} and m.senderId = {0}))  return m order by  m.created DESC")
	List<ChatMessege> findMessegesByUser(Long toUserId,Long fromUserId);

}
