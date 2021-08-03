package org.superops.demo.moviebooking.entity;

import lombok.*;
import org.superops.demo.moviebooking.model.db.ShowSeat;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShowSeats {

    List<ShowSeat> showSeats;
}
