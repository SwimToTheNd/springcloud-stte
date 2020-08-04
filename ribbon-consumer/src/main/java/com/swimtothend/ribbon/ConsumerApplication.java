/**
 * 
 */
package com.swimtothend.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author BloodFly
 * @date 2018年7月21日
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerApplication.class).web(true).run(args);
	}

}
