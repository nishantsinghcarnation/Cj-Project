package com.cts.cj.repository;

public  class Neo4jQueries {
	
public static String STR_POST_CREATED_BY="match(a:Post) <- [b:POST_CREATED_BY] - (c:User) where id(c)=$createdBy and a.isDeleted=false and a.isPrivate=true  optional match(a:Post) - [d:HAS_ASSOCIATED_URL] -> (e:PostUrl)  return a,e,id(c),c.first_name,c.last_name,c.profileImageUrl";

public static String STR_POST_FOR_GROUP="match(a:Post) - [b:POST_RECEIVED_BY] -> (c:Group) - [d:HAS_ASSOCIATED_MEMBER] -> (e:User) where id(e)=$createdBy and a.isDeleted=false and a.isPrivate=true match(a:Post) <- [h:POST_CREATED_BY] -(i:User) optional match(a:Post) - [g:HAS_ASSOCIATED_URL] -> (f:PostUrl) return a,f,id(i),i.first_name,i.last_name,i.profileImageUrl";

public static String STR_POST_PUBLIC="MATCH (n:Post) where n.isPrivate=false and n.isDeleted=false match(n:Post) <- [p:POST_CREATED_BY] - (q:User) optional match(n:Post) - [m:HAS_ASSOCIATED_URL] -> (o:PostUrl) return n,o,id(q),q.first_name,q.last_name,q.profileImageUrl";

public static String STR_POST_COMMENT="match(a:Post)<-[f:HAS_ASSOCIATE]-(g:Comment) <-[e:HAS_POST_COMMENT] -(u:User) where id(a)=$postId and g.isDeleted=false set g.createdDate=toString(g.createdDate) return g,id(u),u.first_name,u.last_name,a,u.profileImageUrl";

public static String STR_POST_TAG_USERS="Match(a:Post)-[g:POST_RECEIVED_BY_USER]->(d:User) where id(a)=$postId  return id(d)";

public static String STR_POST_TAGGED_FOR="match(a:Post) - [b:POST_RECEIVED_BY_USER] -> (c:User) where id(c)=$createdBy and a.isDeleted=false and a.isPrivate=true  optional match(a:Post) - [d:HAS_ASSOCIATED_URL] -> (e:PostUrl)  return a,e,id(c),c.first_name,c.last_name,c.profileImageUrl";

public static String STR_CONNECTIONS_CQL="match(a:User) -[b:Connected] -(c:User)where a.email=$emailId optional match(c:User) -[d:HAS_OCCUPATION] -> (e:Occupation) return c,b.ConnectionDate,d,e ORDER BY b.ConnectionDate DESC";
}
