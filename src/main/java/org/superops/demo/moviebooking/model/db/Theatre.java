package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "THEATRE")
public class Theatre {

    @Id
    private Long theatreId;
    private String theatreName;
    private Integer totalScreens;

    @OneToOne
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location location;
}
