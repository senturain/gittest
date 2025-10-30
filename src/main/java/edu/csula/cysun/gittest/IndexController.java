package edu.csula.cysun.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    String index(Model model){
        model.addAttribute("title", "Gittest");
        return "index";
    }
}
