package com.lld.moviebooking.model;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Movie {
    private UUID id;
    private String name;
    private Genre genre;
    private Language language;
    private int durationInMinutes;
    private List<Show> shows;

    public Movie(String name, Genre genre, Language language, int durationInMinutes, List<Show> shows) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.durationInMinutes = durationInMinutes;
        this.shows = shows;
    }
}
