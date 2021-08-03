package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "SEAT")
public class Seat {

    enum SeatType {
        BALCONY, INSIGNA, PREMIUM;
    }

    @Id
    private Long seatId;
    private Integer seatNumber;
    private SeatType seatType;
    private Long screenId;

}
