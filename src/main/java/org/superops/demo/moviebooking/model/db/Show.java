package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "SHOW")
public class Show {

    @Id
    private Long showId;

    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Long movieId;

    @OneToOne
    @JoinColumn(name = "screenId", referencedColumnName = "screenId")
    private Screen screen;
}
