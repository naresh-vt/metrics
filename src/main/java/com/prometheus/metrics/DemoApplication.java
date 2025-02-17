package com.prometheus.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration;

@SpringBootApplication(exclude = {
		SystemMetricsAutoConfiguration.class,
		JvmMetricsAutoConfiguration.class
})
public class DemoApplication {
	public static void main(String[] args) {
		System.setProperty("spring.jmx.enabled", "false");
		SpringApplication.run(DemoApplication.class, args);
	}
}