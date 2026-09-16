package in.coderarmy.githubActionDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Tejas! Welcome back. How are You?";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye Bye!";
    }

    @GetMapping("/hi")
    public String hi() {
        return "I am saying Hi!";
    }
}
