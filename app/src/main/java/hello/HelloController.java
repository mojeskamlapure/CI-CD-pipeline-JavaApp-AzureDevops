package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "This is awesome..! I am updated now Ok..!";
    }   
    
    @RequestMapping("/show")
    public String show() {
        return "This is an amazing thing to show..!";
    }  
}
