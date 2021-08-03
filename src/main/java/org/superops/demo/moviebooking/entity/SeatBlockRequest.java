package org.superops.demo.moviebooking.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeatBlockRequest {

    private Long showSeatId;
}
