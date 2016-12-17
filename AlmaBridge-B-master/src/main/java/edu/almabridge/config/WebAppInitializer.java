package edu.almabridge.config;

import javax.servlet.Filter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("In getRootConfigClasses method of WebAppInitializer class");
		return new Class[] { AlmaBridgeConfiguration.class};
		
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("In getServletConfigClasses method of WebAppInitializer class");
		
		return null;
	}
	@Override
	protected String[] getServletMappings() {
		System.out.println("In getServletMappings method of WebAppInitializer class");
		 return new String[] { "/" };
	}
	@Override
    protected Filter[] getServletFilters() {
        Filter [] singleton = { new CORSFilter() };
        return singleton;
    }
	
	protected ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContextConfig.xml");
}
