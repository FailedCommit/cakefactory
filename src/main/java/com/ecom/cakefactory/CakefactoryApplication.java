package com.ecom.cakefactory;

import com.samskivert.mustache.Mustache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class CakefactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CakefactoryApplication.class, args);
    }
}
