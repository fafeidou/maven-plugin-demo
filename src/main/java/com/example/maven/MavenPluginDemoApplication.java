package com.example.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenPluginDemoApplication implements CommandLineRunner {

    @Autowired
    private MyConfig myConfig;

    public static void main(String[] args) {
        System.out.println(MyConstant.APP_ID);
        System.out.println(System.getProperty("app.test"));
        SpringApplication.run(MavenPluginDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myConfig);
    }
}
