package com.cts.cj.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import com.cts.cj.domain.ChatMessege;
import com.cts.cj.domain.RealTimeUser;
import com.cts.cj.domain.User;
import com.cts.cj.dto.MessageRequestResponse;
import com.cts.cj.dto.SharePostResponse;
import com.cts.cj.dto.UserResponse;



@Component
public class BeanMapperUtil extends DozerBeanMapper {

	public UserResponse mapAsUserResponse(User user) {
		UserResponse userRes = this.map(user, UserResponse.class);
		userRes.setOnline(RealTimeUser.isUserOnline(userRes.getId()));
		userRes.setSocketId(RealTimeUser.getSocketId(userRes.getId()));
		return userRes;
	}

	public List<UserResponse> mapAsUserResponseList(List<User> users) {
		List<UserResponse> userResponses = new ArrayList<>();
		if (users != null && !users.isEmpty()) {
			for (User userObj : users) {
			
				userResponses.add(this.mapAsUserResponse(userObj));
			
			}
		}
		return userResponses;
	}
	public MessageRequestResponse mapAsMessageRequestResponse(ChatMessege message) {
		MessageRequestResponse messageRequestResponse = this.map(message, MessageRequestResponse.class);
			return messageRequestResponse;
	}

	public List<MessageRequestResponse> mapAsMessageRequestResponseList(List<ChatMessege> messages) {
		List<MessageRequestResponse> messageReqResponses = new ArrayList<>();
		if (messages != null && !messages.isEmpty()) {
			for (ChatMessege messageObj : messages) {
				messageReqResponses.add(this.mapAsMessageRequestResponse(messageObj));
			}
		}
		return messageReqResponses;
	}
	
	public SharePostResponse mapAsSharePostRequestResponse(User sharePost) {
		SharePostResponse sharePostResponse = this.map(sharePost, SharePostResponse.class);
			return sharePostResponse;
	}

	public List<SharePostResponse> mapAsShareRequestResponseList(List<User> user) {
		List<SharePostResponse> messageReqResponses = new ArrayList<>();
		if (user != null && !user.isEmpty()) {
			for (User sharePost : user) {
				messageReqResponses.add(this.mapAsSharePostRequestResponse(sharePost));
			}
		}
		return messageReqResponses;
	}

}
