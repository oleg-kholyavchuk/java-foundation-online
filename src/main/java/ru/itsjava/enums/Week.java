package ru.itsjava.enums;

public enum Week {
    Monday("Дунь тяжолый"), Tuesday("Тоже не кростой"), Wednesday("Вот и середина недели"), Thursday("Маленькая пятница"), Friday("Маленькая суббота"), Saturday("Пошла веселуха!"), Sunday("Как уже все?");

    private final String character;

    Week(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Week{" + this.name() +
                " (character='" + character + ")}\n" ;
    }
}
