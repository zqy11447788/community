package com.yu.community.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yu
 * @Description
 * @create 2019-10-19-10:32
 */
    @Configuration
    //@EnableWebMvc
    public class WebConfig implements WebMvcConfigurer {

        @Autowired
        private SessionInterception sessionInterception;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(sessionInterception).addPathPatterns("/**");

    }
}
