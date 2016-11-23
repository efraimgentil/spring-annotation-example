package me.efraimgentil.springannotationexample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"me.efraimgentil.springannotationexample"  })
public class SpringConfig {
	
}
