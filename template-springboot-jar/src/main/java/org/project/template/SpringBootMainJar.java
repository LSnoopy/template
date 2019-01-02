package org.project.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ author liujianjian
 * @ date 2018/8/25 13:46
 */
@SpringBootApplication
public class SpringBootMainJar {
    public static void main(String[] args) {
        if (args == null || args.length == 0)
            args = new String[]{"--spring.profiles.active=dev"};
        SpringApplication.run(SpringBootMainJar.class, args);
    }
}
