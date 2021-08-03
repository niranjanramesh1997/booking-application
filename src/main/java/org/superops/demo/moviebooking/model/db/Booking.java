package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "BOOKING")
public class Booking {

    @Id
    private Long bookingId;
    private Float totalPayment;
    private Integer numberOfSeats;
    private Integer paymentStatus;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    @OneToMany
    @JoinColumn(name = "bookingId", referencedColumnName = "bookingId")
    private List<ShowSeat> seats;
}
