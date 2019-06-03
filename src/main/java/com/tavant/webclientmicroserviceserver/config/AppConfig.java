/*
package com.tavant.webclientmicroserviceserver.config;

import com.tavant.webclientmicroserviceserver.repository.AccountRepository;
import com.tavant.webclientmicroserviceserver.repository.RemoteAccountRepository;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import static com.tavant.webclientmicroserviceserver.WebclientMicroserviceServerApplication.ACCOUNTS_SERVICE_URL;

@Configuration
public class AppConfig{



    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public AccountRepository accountRepository(){
        return new RemoteAccountRepository(ACCOUNTS_SERVICE_URL);
    }
}


*/
