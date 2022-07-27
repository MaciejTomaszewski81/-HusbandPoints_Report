package pl.tomaszewski.demo.points;

import java.time.LocalDate;

public class Points {

    private int points;

    private LocalDate date;

    private String tasks;


    public Points() {
    }

    public Points(int points, LocalDate date, String tasks) {
        this.points = points;
        this.date = date;
        this.tasks = tasks;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }
}