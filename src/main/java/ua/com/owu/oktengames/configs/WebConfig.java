package ua.com.owu.oktengames.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.*;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:///D:" + File.separator + "dev" + File.separator +
                "OktenGamesProject" + File.separator + "pics" + File.separator;
        registry.addResourceHandler("/screenShots/**")
                .addResourceLocations(path);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/screenShots/**")
                .allowedOrigins("http://localhost:4200", "http://localhost:8080");
    }
}
