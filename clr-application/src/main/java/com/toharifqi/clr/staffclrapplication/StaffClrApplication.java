package com.toharifqi.clr.staffclrapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class StaffClrApplication {

    private static final Logger LOG = LoggerFactory.getLogger(StaffClrApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            LOG.info("Starting CLR application");
            ResponseEntity<List<StaffMember>> staffs = restTemplate.exchange(
                    "http://localhost:8080/api/staffs",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<StaffMember>>() {}
            );
            staffs.getBody().forEach( staff -> LOG.info(staff.toString()));
            LOG.info("Finishing CLR application");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(StaffClrApplication.class, args);
    }
}
