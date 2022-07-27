package pl.tomaszewski.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.tomaszewski.demo.engine.Converter;
import pl.tomaszewski.demo.user.User;
import pl.tomaszewski.demo.user.UserDto;

@Service
public class AplicationService {

    private static final String URL = "http://localhost:8080/home/";

    public UserDto getData(String nick) {

        RestTemplate restTemplate = new RestTemplate();

        String url = URL + nick;
        User responseUser = restTemplate.getForObject(url, User.class);

        return Converter.convertUserToUserDto(responseUser);
    }
}