package msabook.ch02.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@EnableAuthorizationServer
@EnableGlobalMethodSecurity
@SpringBootApplication
@RestController
public class OauthApp {

    public static void main(String[] args) {
        SpringApplication.run(OauthApp.class, args);
    }

    @GetMapping("/")
    public Greet greet() {
        return new Greet("hi");
    }
}
