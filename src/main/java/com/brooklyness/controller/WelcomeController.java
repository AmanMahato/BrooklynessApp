package main.java.com.brooklyness.controller;

import main.java.com.brooklyness.dto.UserLoginDTO;
import main.java.com.brooklyness.dto.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aman Mahato
 */

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping
    public String welcomePage(Model model) {
        model.addAttribute("UserLoginDTO", new UserLoginDTO());
        model.addAttribute("UserRegistrationDto", new UserRegistrationDTO());
        return "welcome";
    }

    @RequestMapping("test")
    public String test(@ModelAttribute("userLoginDTO") UserLoginDTO dto,Model m){
        System.out.println(dto.getUserName());
        m.addAttribute("t",dto.getUserName());
        return "test";
    }

}
