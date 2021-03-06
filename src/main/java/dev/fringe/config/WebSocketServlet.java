package dev.fringe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketServlet extends AbstractAnnotationConfigDispatcherServletInitializer implements WebSocketMessageBrokerConfigurer {

	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebSocketServlet.class, MvcConfig.class};
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
    
	//below implements WebSocketMessageBrokerConfigurer
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
