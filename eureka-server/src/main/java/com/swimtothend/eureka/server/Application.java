/**
 * 
 */
package com.swimtothend.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author BloodFly
 * @date 2018年7月15日
 */

@SpringBootApplication
@EnableEurekaServer
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
