package com.hyecheon.springpoll.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-24
 * Time : 오전 12:36
 * Email : ihyecheon@gmail.com
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
