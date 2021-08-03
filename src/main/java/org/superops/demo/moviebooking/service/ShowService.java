package org.superops.demo.moviebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.superops.demo.moviebooking.entity.SeatBlockRequest;
import org.superops.demo.moviebooking.entity.ShowSeats;
import org.superops.demo.moviebooking.model.db.Booking;
import org.superops.demo.moviebooking.model.db.ShowSeat;
import org.superops.demo.moviebooking.model.redis.SeatBlock;
import org.superops.demo.moviebooking.repository.db.BookingRepository;
import org.superops.demo.moviebooking.repository.db.ShowSeatRepository;
import org.superops.demo.moviebooking.repository.redis.SeatBlockRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    @Autowired
    ShowSeatRepository showSeatRepository;

    @Autowired
    SeatBlockRepository seatBlockRepository;

    @Autowired
    BookingRepository bookingRepository;

    public List<ShowSeat> findAllSeatsByShow(Long showId) {

        return showSeatRepository.findShowSeatByShowId(showId).stream()
                .filter(showSeat -> showSeat.getBookingId() == null)
                .collect(Collectors.toList());
    }

    public int blockSeatByShowSeatId(SeatBlockRequest seatBlockRequest) {
        SeatBlock seatBlock = seatBlockRepository.findById(seatBlockRequest.getShowSeatId())
                .orElse(SeatBlock.builder().showSeatId(seatBlockRequest.getShowSeatId()).blocked(false).build());
        if(seatBlock.isBlocked()) {
            System.out.println("Here");
            return 0;
        }
        else {
            seatBlock.setBlocked(true);
            seatBlockRepository.save(seatBlock);
            return 1;
        }
    }

    public Booking bookShowSeats(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

}
