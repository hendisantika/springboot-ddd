package com.hendisantika.springbootddd.creditagency;

import com.hendisantika.springbootddd.creditagency.messaging.CreditAgencyChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(CreditAgencyChannels.class)
public class CreditAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditAgencyApplication.class, args);
    }

}
