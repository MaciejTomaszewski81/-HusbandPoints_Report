package pl.tomaszewski.demo.user;

import pl.tomaszewski.demo.points.Points;

import java.util.List;

public class User {

    private String firstName;

    private String lastName;

    private String nick;

    private List<Points> points;

    public User() {
    }

    public User(String firstName, String lastName, String nick, List<Points> points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }
}