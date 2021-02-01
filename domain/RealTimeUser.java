package com.cts.cj.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class RealTimeUser {

	private static List<SocketUser> onlineUsers = new ArrayList<>();

	public static List<Long> getOnlineUsers() {
		List<Long> userIds = null;
		if (CollectionUtils.isNotEmpty(onlineUsers)) {
			userIds = new ArrayList<Long>();
			for (SocketUser user : onlineUsers) {
				userIds.add(user.getUserId());
			}
		}
		return userIds;
	}

	public static void setOnlineUsers(List<Long> onlineUsers) {
		List<SocketUser> users = null;
		if (CollectionUtils.isNotEmpty(onlineUsers)) {
			users = new ArrayList<>();
			for (Long id : onlineUsers) {
				users.add(new SocketUser(id));
			}
		}
		RealTimeUser.onlineUsers = users;
	}

	public static void addUser(Long userId) {
		if (!RealTimeUser.isUserOnline(userId)) {
			RealTimeUser.onlineUsers.add(new SocketUser(userId));
		}
	}

	public static void removeUser(Long userId) {
		if(onlineUsers!=null)
			for (int i=0 ;i<onlineUsers.size();i++) {
				  SocketUser user=onlineUsers.get(i);
					if(user.getUserId() == userId.intValue()) {
						onlineUsers.remove(i);
	}
			}
			}
	

	public static Boolean isUserOnline(Long userId) {
	boolean isExist=false;
		if(onlineUsers!=null)
			for (SocketUser user : onlineUsers) {
				if (user.getUserId().intValue() == userId.intValue()){
					isExist=true;
	}
			}
		
		return isExist;
	}

	public static String getSocketId(Long userId) {
		if (CollectionUtils.isNotEmpty(onlineUsers)) {
			for (SocketUser user : onlineUsers) {
				if (user.getUserId().intValue() == userId.intValue())
					return user.getSocketId();

			}
		}
		return null;
	}

}
