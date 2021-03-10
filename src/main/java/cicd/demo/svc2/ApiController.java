package cicd.demo.svc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class ApiController {
    @GetMapping("/data21")
    public String getData11() {
        return "data21";
    }

    @GetMapping("/data22")
    public String getData12() {
        return "data22";
    }

    @GetMapping("/data23")
    public String getData13() {
        return "data23";
    }
}
