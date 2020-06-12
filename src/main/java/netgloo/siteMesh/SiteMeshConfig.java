package netgloo.siteMesh;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SiteMeshConfig extends SpringBootServletInitializer {

	@Bean
	public FilterRegistrationBean siteMeshFilter() {

		FilterRegistrationBean fitler = new FilterRegistrationBean();

		SiteMeshFilter siteMeshFilter = new SiteMeshFilter();

		fitler.setFilter(siteMeshFilter);

		return fitler;
	}

}
