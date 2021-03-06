package com.example.demo.common.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new Interceptor())
        //.addPathPatterns("/board/*")
        .addPathPatterns("/member/*")
        .addPathPatterns("/schedule/*")
        .excludePathPatterns("/user/*")
        .excludePathPatterns("/");
  }

}
