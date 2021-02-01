package com.cts.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

import com.cts.cj.util.FileStorageProperties;

@EnableNeo4jRepositories("com.cts.cj.repository")
@ComponentScan({"com.cts.cj.controller"})
@ComponentScan({"com.cts.cj.configuration"})
@ComponentScan({"com.cts.cj.service"})
@ComponentScan({"com.cts.cj.util"})
@ComponentScan({"com.cts.cj.scheduler"})
@EntityScan("com.cts.cj.domain")
@EnableConfigurationProperties({
	FileStorageProperties.class
})
@EnableScheduling
@EnableWebSocket
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class },scanBasePackages = {"com.cts.cj.controller,com.cts.cj.service"})
public class CJApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CJApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(CJApplication.class, args);
	}
	
	

}
