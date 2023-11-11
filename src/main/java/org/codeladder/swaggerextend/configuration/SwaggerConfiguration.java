package org.codeladder.swaggerextend.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description
 * @author: xuefei
 * @create 2023/11/8 23:20:13
 */
@Configuration
@EnableWebMvc
@OpenAPIDefinition(
        info = @Info(
                title = "My API Documentation",
                version = "1.0",
                description = "Description of my API"
        ),
        servers = @Server(url = "/")
)
public class SwaggerConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/swagger-ui/3.50.0/");
    }
}
