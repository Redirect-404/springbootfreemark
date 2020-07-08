package com.test.springbootfreemark.controller;

import com.test.springbootfreemark.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/table")
    public String getUser(Model model){
        List<Users> list = new ArrayList<Users>();
        list.add(new Users("12","男","90"));
        list.add(new Users("11","女","90"));
        list.add(new Users("13", "男", "90"));
        model.addAttribute("list",list);
        return "table";
    }
}
