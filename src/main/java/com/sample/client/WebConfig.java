package com.sample.client;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@Slf4j
public class WebConfig extends WebMvcConfigurerAdapter {

	@Value("${logging.file}")
	private String loggingFile;

	@RequestMapping("/test")
	@ResponseBody
	public String user() {
		
		log.debug("debug");
		log.debug("info");
		log.debug("warn");
		log.debug("error");
		
		return loggingFile;
	}

}