package com.xworkz.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class MovieTicketDTO {

    private String theatreName;
    private String seatType;
    private String dateTime;
    private int totalTicketQuantity;
}
