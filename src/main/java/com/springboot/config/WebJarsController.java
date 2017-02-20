package com.springboot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.webjars.WebJarAssetLocator;

//管理jquery版本号
@Controller
public class WebJarsController {

	private final WebJarAssetLocator walocator = new WebJarAssetLocator();

	@RequestMapping("/webjarslocator/{webjar}/**")
	@ResponseBody
	public ResponseEntity<Object> locateWebjarAsset(@PathVariable String webjar,HttpServletRequest request){
		try {
			String mvcPrefix = "/webjarslocator/" + webjar + "/";
			String mvcPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
			String fullPath = walocator.getFullPath(webjar,mvcPath.substring(mvcPrefix.length()));
			return new ResponseEntity<Object>(new ClassPathResource(fullPath),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
}
