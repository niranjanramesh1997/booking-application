package org.superops.demo.moviebooking.model.redis;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@Builder
@RedisHash(value = "SeatBlock", timeToLive = 120L)
public class SeatBlock {

    @Id
    Long showSeatId;
    boolean blocked;
}
