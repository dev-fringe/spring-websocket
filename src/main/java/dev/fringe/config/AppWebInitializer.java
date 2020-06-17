package dev.fringe.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppWebSocketConfig.class};
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
