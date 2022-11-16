package com.kodilla.collections.adv.immutable;

public record BookRecord(String author, String title, int year) {
    @Override
    public String toString() {
        return "BookRecord{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
