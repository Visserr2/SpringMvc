package nl.thuis.tutorial.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * This class replaces the web.xml
 * @author ronald
 *
 */
public class WebApplicationInitializerImpl implements WebApplicationInitializer {
	
	private static final int ONE = 1;
	private static final String ROOT = "/";
	
	/**
	 * This method initializes the application context and dispatcher servlet
	 * at startup of the web application
	 */
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// Setting application context with annotations
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(WebConfig.class);
		
		// Creating dispatcher servlet
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(appContext));
		dispatcher.addMapping(ROOT);
		dispatcher.setLoadOnStartup(ONE);
		
	}

}
