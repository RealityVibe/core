package com.example.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author by yze on 2019/10/17
 * @see
 * @since 20191025
 */
@Configuration
@ImportResource("classpath:dubbo/dubbo-provider.xml")
public class DubboConfig {
}
