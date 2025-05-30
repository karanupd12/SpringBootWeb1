package com.karan.SpringBootWeb1;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, ModelAndView mv) {
        System.out.println("add method called");

        int result = n1 + n2;
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }
}
