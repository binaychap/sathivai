package org.codebhatti.sathivai.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by binai_rai on 11/26/17.
 */
@Configuration
class WebConfig extends WebMvcConfigurerAdapter {


    @Override
    void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry)
        registry.addViewController("/login").setViewName("auth/login")
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE)
    }
}
