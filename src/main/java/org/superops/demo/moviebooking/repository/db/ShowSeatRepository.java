package org.superops.demo.moviebooking.repository.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.superops.demo.moviebooking.model.db.ShowSeat;

import javax.transaction.Transactional;
import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    List<ShowSeat> findShowSeatByShowId(Long showId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE SHOW_SEAT set blocked = true where showSeatId = :showSeatId and blocked = false")
    int blockSeatByShowSeatId(Long showSeatId);
}
