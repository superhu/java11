package top.wasm.java11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hi")
    public String hello(@ModelAttribute("name") String name){
        var str = " hello world ";

        System.out.println(str.strip());



        return "hello "+name.repeat(3);
    }



}
