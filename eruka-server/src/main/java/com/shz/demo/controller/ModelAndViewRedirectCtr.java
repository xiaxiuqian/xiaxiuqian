package com.shz.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 测试ModelAndView 重定向
 * 
 * @author 86177
 *
 */
@Controller
@RequestMapping("/mvredirect")
public class ModelAndViewRedirectCtr {

	private final Logger logger = LoggerFactory.getLogger(ModelAndViewRedirectCtr.class);

	@GetMapping("/test1")
	public ModelAndView test1(HttpServletRequest request) {
		logger.info("http://49.235.38.184:8088/test.html");
		return new ModelAndView(new RedirectView("http://49.235.38.184:8088/test.html"));
	}

}
