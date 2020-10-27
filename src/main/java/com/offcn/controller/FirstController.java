package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller     //注意：如果使用thymeleaf模板 则一定要使用controller注解
//@RestController       Controller+ResponseBody
public class FirstController {

    @RequestMapping("/index1")
    public String index1(Model model){
        model.addAttribute("message","欢迎来到优就业");

        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(24);
        model.addAttribute("user",user);

        Map map = new HashMap();
        map.put("id",2L);
        map.put("name","李四");
        map.put("age",23);
        model.addAttribute("map",map);
        return "index1";
    }

    @RequestMapping("/index2")
    public String index2(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(24);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("张四");
        user2.setAge(25);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("张五");
        user3.setAge(26);
        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list",list);
        return "index2";
    }

    @RequestMapping("/index3")
    public String index3(Model model){
        model.addAttribute("message","hello thymeleaf");
        model.addAttribute("name","zhangsan");
        model.addAttribute("username","张三");
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5(Model model){
        //定义日期
        Date date = new Date();
        model.addAttribute("date",date);
        //定义数字
        double num = 1237.54123;
        model.addAttribute("num",num);
        //定义文本
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("str",str);
        return "index5";
    }
}
