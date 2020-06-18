package dev.fringe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.github.mjeanroy.springmvc.view.mustache.configuration.EnableMustache;
import com.github.mjeanroy.springmvc.view.mustache.configuration.MustacheProvider;

@Configuration
@EnableWebMvc
@EnableMustache(provider = MustacheProvider.AUTO)
@ComponentScan({ "dev.fringe.controller"})
public class MvcConfig implements WebMvcConfigurer {
	
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); 
    }
}
