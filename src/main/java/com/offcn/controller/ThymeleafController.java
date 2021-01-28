package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller   //可以进行跳转
public class ThymeleafController {

    @RequestMapping("/index01")
    public String index01(Model model){
        model.addAttribute("msg","欢迎你");
        return "index01.html";
    }

    @RequestMapping("/index02")
    public String index02(Model model){
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setName("wangwu");
        user.setSex("nan");
        user.setId(2);

        map.put("user","111111");
        model.addAttribute("user1",map);
        model.addAttribute("user",user);
        return "index01.html";
    }

    @RequestMapping("/index03")
    public String index03(Model model){
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setSex("男");
        user.setName("张三");

        User user1 = new User();
        user1.setId(3);
        user1.setName("王五");
        user1.setSex("男");

        list.add(user);
        list.add(user1);
        model.addAttribute("list",list);
        return "index02.html";

    }

    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("msg","欢迎来到学习");
        return "index03.html";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","yes");

        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index04.html";
    }

    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date",new Date());

        model.addAttribute("number",123.476);

        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("str",str);

        return "index05.html";
    }

}
