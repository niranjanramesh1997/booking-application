package org.superops.demo.moviebooking.repository.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.superops.demo.moviebooking.model.db.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
