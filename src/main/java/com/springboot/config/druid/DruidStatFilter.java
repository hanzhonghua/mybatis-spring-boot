package com.springboot.config.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * Druid过滤器
 * <p>Title: DruidStatFilter</p>
 * @author hanzhonghua
 * @2017年2月20日 下午11:00:50
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
	initParams = {
		//忽略资源
		@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")	
	})
public class DruidStatFilter extends WebStatFilter {

}
