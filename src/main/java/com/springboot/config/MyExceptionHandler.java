package com.springboot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
//异常处理
@ControllerAdvice
public class MyExceptionHandler {
	
	private static final String ERROR_VIEW = "error";

	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e){
		ModelAndView mv = new ModelAndView(ERROR_VIEW);
		mv.addObject("error", e.getMessage());
		return mv;
	}
}
