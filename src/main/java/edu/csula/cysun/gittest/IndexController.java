package edu.csula.cysun.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        // Make some changes for customer 1
        // ...
        return "index";
    }
}
