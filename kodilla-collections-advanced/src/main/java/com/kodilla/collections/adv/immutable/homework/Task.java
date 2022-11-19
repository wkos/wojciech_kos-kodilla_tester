package com.kodilla.collections.adv.immutable.homework;

public record Task(String title, int duration) {
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
