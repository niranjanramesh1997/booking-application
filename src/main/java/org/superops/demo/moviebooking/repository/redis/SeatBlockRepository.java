package org.superops.demo.moviebooking.repository.redis;

import org.springframework.data.repository.CrudRepository;
import org.superops.demo.moviebooking.model.redis.SeatBlock;

public interface SeatBlockRepository extends CrudRepository<SeatBlock, Long> {
}
