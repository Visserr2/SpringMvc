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
	
	/**
	 * This method defines the JSP View Controller
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	/**
	 * This method adds resource handler and reads the static resources under the folder resources
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	/**
	 * This methods imports properties from property file (countries.properties)
	 * @return PropertyFactoryBean-Object
	 */
	@Bean(name = "countries")
	public PropertiesFactoryBean countries() {
	    PropertiesFactoryBean bean = new PropertiesFactoryBean();
	    bean.setLocation(new ClassPathResource("countries.properties"));
	    return bean;
	}
}
