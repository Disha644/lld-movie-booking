package com.lld.moviebooking.model;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    private UUID id;
    private RegisteredUser user;
    private Show show;
}
