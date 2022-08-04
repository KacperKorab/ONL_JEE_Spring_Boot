package pl.coderslab.springboottest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.springboottest.data.Data;
import pl.coderslab.springboottest.data.DataRepository;

@Controller
@RequestMapping("/springBoot")
public class HomeController {

    final WebAppConfig webAppConfig;
    final DataRepository dataRepository;

    public HomeController(WebAppConfig webAppConfig, DataRepository dataRepository) {
        this.webAppConfig = webAppConfig;
        this.dataRepository = dataRepository;
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "Here you can find some details for logged users";
    }

    @GetMapping("/admin/test")
    @ResponseBody
    public String adminTest() {
        return "Here you can find some details for admins";
    }

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }


    @GetMapping("/getData/{id}")
    @ResponseBody
    public String getData(@PathVariable String id) {
        try {
            Data data = dataRepository.findById(Long.parseLong(id));
            return data.toString();
        }
        catch (NumberFormatException e) {
            return "id must be a number";
        }
        catch (NullPointerException e) {
            return "no entry with such id found";
        }
    }
}
