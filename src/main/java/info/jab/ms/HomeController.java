package info.jab.ms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
    // Redirecting / to /swagger-ui/index.html 
    @RequestMapping(value="/")
    public String index() {
        return "redirect:/swagger-ui/index.html";
    }
}