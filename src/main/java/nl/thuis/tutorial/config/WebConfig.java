package nl.thuis.tutorial.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This file replaces the Spring-Context.xml file
 * @author ronald
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan({"nl.thuis.tutorial.controller"})
public class WebConfig implements WebMvcConfigurer {
	
	private static final String COUNTRIES_PROPERTIES = "countries.properties";
	
	private static final String PREFIX = "/WEB-INF/view/";
	private static final String SUFFIX = ".jsp";
	private static final String RESOURCE_PATH_PATTERN = "/resources/**";
	private static final String RESOURCE_LOCATIONS = "/resources/";
	
	/**
	 * This method defines the JSP View Controller
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp(PREFIX, SUFFIX);
	}
	
	/**
	 * This method adds resource handler and reads the static resources under the folder resources
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(RESOURCE_PATH_PATTERN).addResourceLocations(RESOURCE_LOCATIONS);
	}
	
	/**
	 * This methods imports properties from property file (countries.properties)
	 * @return PropertyFactoryBean-Object
	 */
	@Bean(name = "countries")
	public PropertiesFactoryBean countries() {
	    PropertiesFactoryBean bean = new PropertiesFactoryBean();
	    bean.setLocation(new ClassPathResource(COUNTRIES_PROPERTIES));
	    return bean;
	}
}
