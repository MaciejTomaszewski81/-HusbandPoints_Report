package pl.tomaszewski.demo.engine;

import pl.tomaszewski.demo.points.Points;
import pl.tomaszewski.demo.user.User;
import pl.tomaszewski.demo.user.UserDto;

public class Converter {

    public static UserDto convertUserToUserDto(User user){
        String nick = user.getNick();
        int allPoints = 0;
        for (Points points : user.getPoints()){
            int score = points.getPoints();
            allPoints += score;
        }
        return new UserDto(nick,allPoints);
    }
}