package ua.com.owu.oktengames;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import ua.com.owu.oktengames.models.Platform;
import ua.com.owu.oktengames.servicesImpl.PlatformService;

@SpringBootApplication
public class OktengamesApplication {

    public static void main(String[] args) {

        SpringApplication.run(OktengamesApplication.class, args);
    }

}
