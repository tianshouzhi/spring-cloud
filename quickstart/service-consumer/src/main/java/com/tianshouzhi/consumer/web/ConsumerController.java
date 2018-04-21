package com.tianshouzhi.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tianshouzhi on 2018/4/21.
 */
@RestController
@Configuration
public class ConsumerController {
	@Autowired
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/consume")
	public String consume() {
		return getRestTemplate().getForObject("http://service-provider/hello", String.class);
	}
}
