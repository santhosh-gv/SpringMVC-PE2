package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {


    @PostMapping("/result")
    public ModelAndView getName(HttpServletRequest request)
    {
        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setPassword(request.getParameter("password"));
        ModelAndView  modelAndView = new ModelAndView("result");
        modelAndView.addObject("message","Welcome "+user.getUserName()+" to Stackroute" );
        return modelAndView;
    }
}
