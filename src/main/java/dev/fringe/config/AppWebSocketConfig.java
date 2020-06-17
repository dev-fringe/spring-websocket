package dev.fringe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import com.github.mjeanroy.springmvc.view.mustache.configuration.EnableMustache;
import com.github.mjeanroy.springmvc.view.mustache.configuration.MustacheProvider;

@Configuration
@EnableWebSocketMessageBroker
@EnableWebMvc
@EnableMustache(provider = MustacheProvider.AUTO)
@ComponentScan({ "dev.fringe.controller"})
public class AppWebSocketConfig implements WebSocketMessageBrokerConfigurer {

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
		config.setApplicationDestinationPrefixes("/app");
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/connectWS"); 
		registry.addEndpoint("/connectWS").withSockJS(); 
	}

}
