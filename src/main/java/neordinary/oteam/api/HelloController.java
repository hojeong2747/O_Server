package neordinary.oteam.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/sample")
    public String sample() {
        return "Sample!!!!!!!!";
    }

    @GetMapping("/api/sample")
    public String sampleV2() {
        return "Sample!!!!!!!!";
    }

}
