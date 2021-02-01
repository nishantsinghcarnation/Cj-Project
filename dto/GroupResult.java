package com.cts.cj.dto;

import java.util.List;

import org.springframework.data.neo4j.annotation.QueryResult;

import com.cts.cj.domain.Group;
import com.cts.cj.domain.User;

@QueryResult
public class GroupResult {
	private List<User> loggedInUserlist;
	private List<Group> grouplist;
	private List<User> memberList;
	public List<User> getLoggedInUserlist() {
		return loggedInUserlist;
	}
	public List<Group> getGrouplist() {
		return grouplist;
	}
	public List<User> getMemberList() {
		return memberList;
	}
	public void setLoggedInUserlist(List<User> loggedInUserlist) {
		this.loggedInUserlist = loggedInUserlist;
	}
	public void setGrouplist(List<Group> grouplist) {
		this.grouplist = grouplist;
	}
	public void setMemberList(List<User> memberList) {
		this.memberList = memberList;
	}
	

}
