package com.cts.cj.configuration;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import com.cts.cj.domain.RealTimeUser;
import com.cts.cj.dto.UserResponse;
import com.cts.cj.service.ChatMessegeService;
import com.cts.cj.service.UserService;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	public static final Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);

	@Autowired
	private SimpMessagingTemplate template;

	@Autowired
	UserService userService;

	@Autowired
	ChatMessegeService chatMessegeService;

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic", "/queue");
		config.setApplicationDestinationPrefixes("/app");
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/itoiapi-websocket").setHandshakeHandler(new HandshakeHandler()).setAllowedOrigins("*")
				.withSockJS()
				.setClientLibraryUrl("https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.3.0/sockjs.min.js");
	}

	@EventListener
	public void onSocketConnected(SessionConnectedEvent event) {
		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

		logger.info(("[Connected] " + sha.getSessionId()));
		logger.info("connected: socket-id : " + event.getUser().getName());
		RealTimeUser.addUser(Long.valueOf(event.getUser().getName()));
		logger.info("User count: " + RealTimeUser.getOnlineUsers().size());

		List<UserResponse> friendList = this.chatMessegeService.findAllMembers(Long.valueOf(event.getUser().getName()));
		if (friendList != null && !friendList.isEmpty()) {
			for (UserResponse userResObj : friendList) {
				if (userResObj.getOnline() != null && userResObj.getOnline()) {
					this.template.convertAndSend("/user/" + userResObj.getId() + "/queue/private",
							"{\"userId\":\"" + event.getUser().getName() + "\", \"messageType\":\"online\"}");
				}

			}
		}

	}

	@EventListener
	public void onSocketDisconnected(SessionDisconnectEvent event) {

		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

		logger.info("[Disonnected] " + sha.getSessionId());
		logger.info(sha.getMessage());
		logger.info("disconnected: socket-id : " + event.getUser().getName());
		RealTimeUser.removeUser(Long.valueOf(event.getUser().getName()));
		if(RealTimeUser.getOnlineUsers()!=null) {
		logger.info("User count: " + RealTimeUser.getOnlineUsers().size());
		}
		List<UserResponse> friendList = this.chatMessegeService.findAllMembers(Long.valueOf(event.getUser().getName()));
		if (friendList != null && !friendList.isEmpty()) {
			for (UserResponse userResObj : friendList) {

				if (userResObj.getOnline() != null && userResObj.getOnline()) {
					this.template.convertAndSend("/user/" + userResObj.getId() + "/queue/private",
							"{\"userId\":\"" + event.getUser().getName() + "\", \"messageType\":\"offline\"}");
				}

			}
		}
	}

	private class HandshakeHandler extends DefaultHandshakeHandler {

		@Override
		protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler,
				Map<String, Object> attributes) {
			logger.info(request.getURI().getQuery().split("=")[1]);
			return new Principal() {
				@Override
				public String getName() {
					return request.getURI().getQuery().split("=")[1];
				}
			};
		}
	}

}
