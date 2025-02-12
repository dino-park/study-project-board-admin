package com.greyson.projectboardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class StudyProjectBoardAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyProjectBoardAdminApplication.class, args);
    }

}
