package com.cts.cj.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.Meeting;


public interface MeetingRepository extends Neo4jRepository<Meeting, Long>{
	
	@Query("match(m:Meeting) where ID(m)={0} return m")
	Meeting getMeeting(Long meetingId);
	
	@Query("MATCH (n:Meeting) where n.userId={0} and n.status='ACTIVE' return n")
	public List<Meeting> getMeetingList(Long userid);
	
	

	
}
