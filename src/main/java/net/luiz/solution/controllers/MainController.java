package net.luiz.solution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private static final org.slf4j.Logger log =
            org.slf4j.LoggerFactory.getLogger(MainController.class);


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index(Model model){
        log.info("Accessing index.html");
        model.addAttribute("message", "Luiz");
       return "index";
    }
}
