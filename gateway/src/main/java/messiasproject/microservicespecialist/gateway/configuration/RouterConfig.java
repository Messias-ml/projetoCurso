package messiasproject.microservicespecialist.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator routeLocator (RouteLocatorBuilder builder){
        return builder
                .routes()
                .route(r -> r.path("/clientes/**").uri("lb://cliente"))
                .route(r -> r.path("/cartoes/**").uri("lb://cartoes"))
                .route(r -> r.path("/avaliacoes-credito/**").uri("lb://avaliador-de-credito"))
                .build();
    }
}
