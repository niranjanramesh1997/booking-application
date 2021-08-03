package org.superops.demo.moviebooking.model.db;

import lombok.*;
import javax.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "MOVIE")
public class Movie {

    enum ContentRating {
        G, PG, PG_13, R, NC_17;
    }

    @Id
    private Long movieId;
    private String movieName;
    private String movieGenre;
    private Long runningTime;
    private ZonedDateTime releaseDate;
    private ContentRating rating;

    @OneToMany
    @JoinColumn(name = "movieId", referencedColumnName = "movieId")
    private List<Show> shows;
}

