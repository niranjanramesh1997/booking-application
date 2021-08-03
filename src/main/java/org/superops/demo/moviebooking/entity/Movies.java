package org.superops.demo.moviebooking.entity;

import lombok.*;
import org.superops.demo.moviebooking.model.db.Movie;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movies {

    List<Movie> movies;
}
