/**
 * 
 */
package com.swimtothend.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author BloodFly
 * @date 2018年7月21日
 */
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/ribbon-consumer")
	public String helloConsumer() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
	}
}
