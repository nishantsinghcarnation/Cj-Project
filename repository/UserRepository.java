package com.cts.cj.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.cts.cj.domain.Group;
import com.cts.cj.domain.PostPrevious;
import com.cts.cj.domain.User;

public interface UserRepository extends Neo4jRepository<User, Long> {

	@Query("MATCH (u:User) where u.email={0} and u.password={1} return u")
	User getUser(String email, String password);

	@Query("MATCH(n:User)  where n.emailId={0} and n.mobileNumber={1} and n.mobileNumber={1} and n.name={2} detach delete n")
	User DeleteUser(String email, String password, String name);

	@Query("MATCH (j:Register) WHERE ID(j)={0} DELETE j")
	public void delete(Long id);

	@Query("MATCH (u:User)-[role:HAS_ROLETYPE]->(Role)   RETURN u, role, Role")
	public List<User> getUserList();

	@Query("MATCH(n:User)  where n.emailId={0} and n.password={1} and n.mobileNumber={2}  return n")
	User getExistingUser(String email, String password, String name);

	@Query("MATCH (u:User)-[role:HAS_ROLETYPE]->(roles) where u.email={0} optional match(u) -[d:HAS_OCCUPATION] -> (e:Occupation)  "
			+ " RETURN u,roles,role,e,d")
	User findByEmail(String username);

	@Query("MATCH (u:User)-[role:HAS_ROLETYPE]->(roles) where u.email={0} and u.status='ACTIVE'"
			+ "RETURN u,roles,role")
	Optional<User> findByuserEmail(String username);

	@Query("MATCH (u:User) where u.email={0} and u.inviteCode={1} "
			+ "RETURN u")
	Optional<User> findByEmailandInviteCode(String username, String invitecode);

	@Query("MATCH (u:User)-[role:HAS_ROLETYPE]->(roles) where ID(u)={0}  RETURN u, role, roles")
	User getUserbyId(Long id);

	@Query("MATCH(n:User)  where  n.mobile_number={0} return n")
	User findByMobile(String mobileNumber);

	@Query("MATCH (u:User {email:{0}})" + "SET u.status = {1}" + "RETURN u ")
	User updateUserStatus(String email, String status);

	@Query("MATCH (a:User),(b:User)\r\n" + "WHERE ID(a) ={0}  AND ID(b) ={1}\r\n"
			+ "CREATE (a)<-[r:REFFERED_BY]-(b)\r\n" + "RETURN type(r)")
	User createRelationship(Long parentid, Long childid);

	@Query("match(b:Role{name:'USER'}),(a:User) where a.email={0} create (a)-[c:HAS_ROLETYPE]->(b)")
	User createHasRoleRelationship(String email);

	@Query("MATCH (a:User),(b:User)" + "WHERE ID(a) ={0}  AND ID(b) ={1}\r\n" + "CREATE (a)-[r:SHARED_WITH]->(b)\r\n"
			+ "RETURN type(r)")
	PostPrevious sharedWith(Long parentid, Long childid);

	@Query("MATCH (u:User) where u.email={0} " + "RETURN u")
	User findByInviteEmail(String username);

	@Query("match(e:Education{userId:{0}}),(a:User) where ID(a)={0} MERGE (a)-[c:HAS_EDUCATION]->(e)")
	void createEducationRelationship(Long userId);

	@Query("MATCH (u:User) where ID(u)={0} OPTIONAL MATCH (u)-[e:HAS_EDUCATION]->(educations)  OPTIONAL MATCH (u)-[o:HAS_OCCUPATION]->(occupations) OPTIONAL MATCH (u)-[s:HAS_SKILL]->(skills)  RETURN u,educations,e,occupations,o,skills, s")
	User findUserProfileDetailById(Long userId);

	@Query("match(o:Occupation{userId:{0}}),(a:User) where ID(a)={0} MERGE (a)-[c:HAS_OCCUPATION]->(o)")
	void createOccupationRelationship(Long userId);

	@Query("match(b:Skill{SkillName:{1}}),(a:User) where ID(a)={0} create (a)-[c:HAS_SKILL]->(b)")
	User createHasSKILLRelationship(Long userId, String skillname);

	@Query("MATCH (n:User)-[r:HAS_SKILL]->(skills) where ID(n)={0} DELETE r return n")
	User deleteHasSKILLRelationship(Long userId);

	@Query("MATCH (n:User)-[r:HAS_EDUCATION]->(e:Education) where Id(n)={0} DELETE r,e return n")
	User deleteHasEducationRelationship(Long userId);

	@Query("MATCH (n:User)-[r:HAS_OCCUPATION]->(o:Occupation) where Id(n)={0} DELETE r,o return n")
	User deleteHasOccupationRelationship(Long userId);

	@Query("MATCH (a:User),(b:User) WHERE ID(a)={0}  AND ID(b)={1}	MERGE (a)-[r:Connected{ConnectionDate:datetime()}]->(b) RETURN a, b")
	User connectUser(Long firstId, Long secondId);

	// @Modifying
	@Query("update User u set u.password = :password where u.id = :id")
	void updatePassword(@Param("password") String password, @Param("id") Long id);

	@Query("match(a:User{email:{0}}) -[b:Connected] -(c:User) optional match(c:User) -[d:HAS_OCCUPATION] -> (e:Occupation) return c,b,d,e ORDER BY b.ConnectionDate DESC")

	public List<User> getconnections(String emailid);

	@Query("match(b:User{email:{0}}) -[:Connected|HAS_SENT_REQUEST] - (e) with collect(e.email) as senderemail match(d:User) where d.status='ACTIVE' and not d.email in [{0}] and (d.email =~ {1} or d.first_name =~ {1} or d.last_name =~ {1} ) and not d.email IN (senderemail) return d")

	List<User> getByFirstname(String loginuseremail, String searchstring);

	@Query("match(a:User{email:{0}}) optional match(a:User) - [b:HAS_SENT_REQUEST] -(c:User) with a.email as email,coalesce(c.email,\"abc\") as sendemail MATCH (n:User{email:{0}}) - [m:Connected] -(p:User) - [Q:Connected] - (r:User) where not r.email in [sendemail] optional match(r:User) - [d:HAS_OCCUPATION] -> (e:Occupation) return r,d,e;")

	List<User> getAllRecommendationList(String emailid);
	
	@Query("MATCH (n:User{email:{0}}) MATCH(n)-[:Connected*2]-(m) WHERE NOT(n)-[:Connected]-(m) optional match(m) - [d:HAS_OCCUPATION] -> (e:Occupation) return m,d,e")

	List<User> getRecommendationList(String emailid);

	@Query("match(a:User{email:{0}}) optional match(a:User) - [b:HAS_SENT_REQUEST] -(c:User)  return c")

	List<User> getduplicateRecmondationList(String emailid);
	

	@Query("match(n:User{email:{0}}) match(m:User{email:{1}}) merge(n) -[p:HAS_SENT_REQUEST{requestdate:datetime()}]-> (m) return m")
	User getconnectUser(String loginuseremailid, String connecteduseremailid);

	@Query("match(a:User{email:{0}}) match(b:User{email:{1}}) create(c:EmailMesssage{Description:{2},createdDate:datetime()}), (a) -[d:HES_EMAIL_SENDER] ->(c),(b) <- [e:HAS_EMAIL_RECEIVER] -(c) return c")
	User saveMessage(String senderemailId, String receiveremailId, String messageContent);

	@Query("MATCH (n:User{email:{0}}) -[p:Connected] - (m:User{email:{1}}) delete p return n")
	User deleteConnection(String loginuseremailId, String deletedemailId);

	// List<User> getByFirstname(String string);

	/*
	 * @Query("match(a:User{email:\"sheetanshu.tripathi@cardinaltsinc.net\"}) -[b:Connected] -(c:User)  optional match(c:User) -[d:HAS_OCCUPATION] -> (e:Occupation) return id(c)  ,c.email,c.first_name,c.last_name,c.profileImageUrl,e.designation,e.startdate,b.ConnectionDate,e.endDate,e.tillDate , b order by b.ConnectionDate desc"
	 * )
	 * 
	 * 
	 * public List<User> getconnectionstest(String emailid);
	 */

	@Query("match (n:User{email:{0}}) -[p:HAS_SENT_REQUEST]-> (m:User) optional match(m:User) - [d:HAS_OCCUPATION] -> (e:Occupation)  return m,d,e")
	public List<User> sentInvitesList(String emailid);

	@Query("match (n:User{email:{0}}) <-[p:HAS_SENT_REQUEST]- (m:User) optional match(m:User) - [d:HAS_OCCUPATION] -> (e:Occupation)  return m,d,e")
	public List<User> receivedInvitesList(String emailid);

	@Query("match (n:User{email:{0}})  - [p:HAS_SENT_REQUEST] -> (m:User{email:{1}}) delete p  return m,n")
	void declineRequest(String emailId, String declinedEmail);

	@Query("match (n:User{email:{0}}) <- [p:HAS_SENT_REQUEST] - (m:User{email:{1}}) delete p   return m,n")
	void ignoreRequest(String emailId, String ignoredEmail);

	@Query("match (n:User{email:{0}}) <- [p:HAS_SENT_REQUEST] - (m:User{email:{1}}) delete p merge(n) -[c:Connected{ConnectionDate:datetime()}] ->(m) return n,m")
	void confirmRequest(String emailId, String confirmedEmail);
	
	@Query("Create (a:Group{Groupname:{0},Description:{1},Photourl:{2},createddate:datetime(),createBy:{3}}) with id(a) as groupid Match(b:Group) where id(b)=groupid match(d:User) where id(d) in [4] create(b) -[c:HAS_ASSOCIATED_MEMBER] ->(d) return b")
    Group createGroup(String groupName, String groupDescription, String photo_url, String created_by,
			List<Integer> user_ids);
	
	@Query("match(a:User{email:{0} }) - [b:Connected] - (c:User)  return c ORDER BY b.ConnectionDate DESC ")
	List<User> getconnectedUserList(String email);
	
}
