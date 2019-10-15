package com.pro.book.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.pro.book"))
                .paths(PathSelectors.any()).build();


    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Online Book management store api",
                "Book store",
                "1.0.0",
                "Terms of service",
                new Contact("developer", "www.apanakaam.com", "myeaddress@company.com"),
                "License of API", "API license URL", Lists.newArrayList());
    }
}
