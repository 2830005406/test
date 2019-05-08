package xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.entity.User;
import xyz.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request, HttpServletResponse response){
        List<User> all = userService.findAll();
        request.setAttribute("all",all);
        return "index";
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.add(user);
        return "redirect:/user/findAll";
    }
}
