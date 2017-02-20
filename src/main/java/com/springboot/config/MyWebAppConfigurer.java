package com.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//定义新的资源映射目录
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/img","classpath:/img2");
		registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/")
				.addResourceLocations("classpath:/myresss/");
//		registry.addResourceHandler("/files/**").addResourceLocations("file:D:/eclipse/");
		super.addResourceHandlers(registry);
	}
}
