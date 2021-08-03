package org.superops.demo.moviebooking.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeatBlockResponse {

    Long showSeatId;
    Boolean blocked;
    String message;
}
