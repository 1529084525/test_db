package test.sqlite.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author ZhiXiang
 * @create 2020/2/25 17:10
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String skipLogin() {
        return "login";
    }

}
