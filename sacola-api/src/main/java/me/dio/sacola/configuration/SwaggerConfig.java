package me.dio.sacola.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public  Docket getBean(){
        return  new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.regex(pathRegex:"/ifood-devweek/.*"))
                .build()
                .epiImfo(getInfo());

    }
    private ApiInfo getInfo(){
        return  new ApiInfoBuilder()
                .title("sacola API")
                .description("acola API para servir uma aplicação de Delivery")
                .build();
    }

}
