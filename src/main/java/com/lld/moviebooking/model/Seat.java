package com.lld.moviebooking.model;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Seat {
    private UUID id;
    private SeatType type; 
    private boolean reserved;
    private int price;

    public Seat(SeatType type, boolean reserved, int price) {
        this.type = type;
        this.reserved = reserved;
        this.price = price;
    }

}
