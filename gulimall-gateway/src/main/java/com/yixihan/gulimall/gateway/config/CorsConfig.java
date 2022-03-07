package com.yixihan.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Collections;

/**
 * @author : yixihan
 * @create : 2022-03-07-23:39
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter () {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource ();

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // 1. 配置跨域
        corsConfiguration.setAllowedHeaders (Collections.singletonList ("*"));
        corsConfiguration.setAllowedMethods (Collections.singletonList ("*"));
        corsConfiguration.setAllowedOrigins (Collections.singletonList ("*"));
        corsConfiguration.setAllowCredentials (true);

        source.registerCorsConfiguration ("/**", corsConfiguration);
        return new CorsWebFilter (source);
    }
}
