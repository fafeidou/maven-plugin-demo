package com.example.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenPluginDemoApplication implements CommandLineRunner {

    @Autowired
    private MyConfig myConfig;

    @Value("${app.test}")
    private String testValue;

    public static void main(String[] args) {
        System.out.println(com.example.maven.MyConstant.APP_ID);
        SpringApplication.run(MavenPluginDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myConfig);
    }
}
