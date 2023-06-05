package com.hjh.hhapiclientsdk;


import com.hjh.hhapiclientsdk.client.Client;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@ComponentScan
@ConfigurationProperties("api.client")
@Configuration
public class HClientConfig {


    private String accessKey;

    private String secretKey;


    @Bean
    public Client client() {

        return new Client(accessKey, secretKey);
    }


}
