package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "SHOW_SEAT")
public class ShowSeat {
    @Id
    private Long showSeatId;
    private Float price;
    private Long showId;
    private Boolean blocked;
    private Long bookingId;

    @OneToOne
    @JoinColumn(name = "seatId", referencedColumnName = "seatId")
    private Seat seat;

}
