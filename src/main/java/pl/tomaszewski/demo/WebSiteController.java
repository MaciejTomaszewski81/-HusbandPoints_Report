package pl.tomaszewski.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.tomaszewski.demo.user.UserDto;

@RestController
public class WebSiteController {
    AplicationService aplicationService;

    public WebSiteController(AplicationService aplicationService) {
        this.aplicationService = aplicationService;
    }

    @GetMapping("/home/{user}")
    public UserDto getUserScore(@PathVariable String user){
        return aplicationService.getData(user);
    }
}