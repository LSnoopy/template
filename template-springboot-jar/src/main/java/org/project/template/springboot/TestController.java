package org.project.template.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author liujianjian
 * @ date 2018/8/25 13:51
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/t")
    public Object t() {
        return "Hello world";
    }
}
