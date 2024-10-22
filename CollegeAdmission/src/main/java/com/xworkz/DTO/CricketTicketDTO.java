package com.xworkz.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CricketTicketDTO {

    private String groundName;
    private String customerName;
    private String customerEmail;
    private String seatType;
    private int numberOfTickets;
}
