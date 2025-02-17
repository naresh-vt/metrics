package com.prometheus.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    private final MeterRegistry registry;

    public MetricsController(MeterRegistry registry) {
        this.registry = registry;
    }

    @GetMapping("/")
    public String root() {
        registry.counter("endpoint.root.hits").increment();
        return "Welcome to the metrics demo!";
    }

    @GetMapping("/hello")
    public String hello() {
        registry.counter("endpoint.hello.hits").increment();
        return "Hello, Metrics World!";
    }
}
