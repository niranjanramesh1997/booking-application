package org.superops.demo.moviebooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.superops.demo.moviebooking.entity.SeatBlockRequest;
import org.superops.demo.moviebooking.entity.SeatBlockResponse;
import org.superops.demo.moviebooking.entity.ShowSeats;
import org.superops.demo.moviebooking.model.db.ShowSeat;
import org.superops.demo.moviebooking.service.ShowService;

import java.util.List;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    ShowService showService;

    @GetMapping(value = "/{showId}/seats", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShowSeats> getSeatsByShow(@PathVariable("showId") Long showId) {
        List<ShowSeat> seats = showService.findAllSeatsByShow(showId);
        return ResponseEntity.ok(ShowSeats.builder().showSeats(seats).build());
    }

    @PatchMapping(value = "/seat", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SeatBlockResponse> blockSeatByShow(@RequestBody SeatBlockRequest seatBlockRequest) {
        int rowsUpdated = showService.blockSeatByShowSeatId(seatBlockRequest);
        SeatBlockResponse response = new SeatBlockResponse();
        if(rowsUpdated == 0) {
            response.setShowSeatId(seatBlockRequest.getShowSeatId());
            response.setBlocked(false);
            response.setMessage("Unable to block as the seat has already been blocked");
        }
        else {
            response.setShowSeatId(seatBlockRequest.getShowSeatId());
            response.setBlocked(true);
            response.setMessage("Seat has been blocked");
        }
        return ResponseEntity.ok(response);
    }
}
