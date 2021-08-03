package org.superops.demo.moviebooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.superops.demo.moviebooking.entity.ShowSeats;
import org.superops.demo.moviebooking.model.db.Booking;
import org.superops.demo.moviebooking.service.ShowService;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    ShowService showService;

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Booking> bookShowSeat(@RequestBody Booking booking) {
        Booking confirmedBooking = showService.bookShowSeats(booking);
        return ResponseEntity.ok(confirmedBooking);
    }

    @GetMapping(value = "/{bookingId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Booking> getBookingById(@PathVariable("bookingId") Long bookingId) {
        return ResponseEntity.ok(showService.getBookingById(bookingId));
    }
}
