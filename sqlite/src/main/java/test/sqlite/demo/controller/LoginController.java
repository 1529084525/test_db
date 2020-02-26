package test.sqlite.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import test.sqlite.demo.entity.User;
import test.sqlite.demo.service.UserService;

/**
 * @Author ZhiXiang
 * @create 2020/2/25 17:10
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String skipLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model) {
        if (!userService.isTrue(user)) {
            model.addAttribute("msg", "登录失败");
            return "login";
        }
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/loginOut")
    public String loginOut() {
        return "login";
    }

}
