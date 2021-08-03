package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "LOCATION")
public class Location {

    @Id
    private Long locationId;
    private String cityName;
    private String pinCode;
}
