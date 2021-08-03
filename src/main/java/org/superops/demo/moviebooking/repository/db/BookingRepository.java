package org.superops.demo.moviebooking.repository.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.superops.demo.moviebooking.model.db.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
