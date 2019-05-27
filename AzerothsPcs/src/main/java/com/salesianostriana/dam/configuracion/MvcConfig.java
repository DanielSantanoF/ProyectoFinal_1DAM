package com.salesianostriana.dam.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Daniel Santano Fernández
 * Clase que usamos para configurar el MVC
 */
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	/**
	 * Metodo para decir el getmaping de login y acceso denegado
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login");
		registry.addViewController("/AccesoDenegado");
	}
	
	/**
	 * Metodo para indicar donde estan nuestras rutas estaticas necesario al usar la anotación @EnableWebMvc
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("file:files/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		registry.addResourceHandler("/admin/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/productos/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/admin/css/**").addResourceLocations("classpath:/static/css/");
			
	}

	
	
}
