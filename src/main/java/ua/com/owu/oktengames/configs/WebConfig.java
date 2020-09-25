package ua.com.owu.oktengames.configs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ua.com.owu.oktengames.components.FileManager;
import ua.com.owu.oktengames.models.Product;


@Configuration
@NoArgsConstructor
@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private FileManager<Product> productFileManager;

    /***
     * This method handles all the requests to static files
     * and redirects them to actual file system
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/screenShots/**")
                .addResourceLocations(productFileManager.getFilesFolderPath());
    }
}
