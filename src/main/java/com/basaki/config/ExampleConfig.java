package com.basaki.config;

import com.basaki.aspect.CustomAnnotationAspect;
import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
public class ExampleConfig {
    @Bean
    public CustomAnnotationAspect customAnnotationAspect() {
        return Aspects.aspectOf(CustomAnnotationAspect.class);
    }
}
