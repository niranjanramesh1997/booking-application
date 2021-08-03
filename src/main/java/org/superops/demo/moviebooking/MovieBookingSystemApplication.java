package org.superops.demo.moviebooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.superops.demo.moviebooking.repository.db.BookingRepository;
import org.superops.demo.moviebooking.repository.db.MovieRepository;

@SpringBootApplication
public class MovieBookingSystemApplication implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private BookingRepository locationRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

//	private void initDB() {
//		movieRepository.save(Movie.builder()
//				.movieGenre()
//				.movieId()
//				.movieName()
//				.rating()
//				.releaseDate()
//				.runningTime()
//				.build());
//	}
}
