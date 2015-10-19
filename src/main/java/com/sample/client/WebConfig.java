package com.sample.client;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@Slf4j
public class WebConfig extends WebMvcConfigurerAdapter {

	@Value("${bar}")
	private String bar;

	@RequestMapping("/test")
	@ResponseBody
	public String user() {
		
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		
		return bar;
	}

}