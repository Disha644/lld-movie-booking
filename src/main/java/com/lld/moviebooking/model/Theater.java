package com.lld.moviebooking.model;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Theater {
    private UUID id;
    private String name;
    private List<Seat> seats;
}
