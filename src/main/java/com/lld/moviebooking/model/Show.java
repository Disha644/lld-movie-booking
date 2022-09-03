package com.lld.moviebooking.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Show {
    private UUID id;
    private Movie movie;
    private Theater theater;
    private LocalDateTime time;
    private List<Seat> seats;
    private int totalAvailableSeats;
    private int regularSeatsAvailable;
    private int premiumSeatsAvailable;
    private int reclinerSeatsAvailable;

    public Show(Movie movie, Theater theater, LocalDateTime time, List<Seat> seats) {
        this.movie = movie;
        this.theater = theater;
        this.time = time;
        this.seats = seats;
        this.totalAvailableSeats = seats.size();
        this.regularSeatsAvailable = 0;
        this.premiumSeatsAvailable = 0;
        this.reclinerSeatsAvailable = 0;
        setSeatCategoryCounts();
    }

    private void setSeatCategoryCounts() {
        for(Seat seat : seats) {
            if(seat.getType().equals(SeatType.REGULAR)) {
                regularSeatsAvailable++;
            } else if(seat.getType().equals(SeatType.PREMIUM)) {
                premiumSeatsAvailable++;
            } else if(seat.getType().equals(SeatType.RECLINER)) {
                reclinerSeatsAvailable++;
            }
        }
    }
}
