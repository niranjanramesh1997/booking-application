package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "SCREEN")
public class Screen {

    @Id
    private Long screenId;
    private Integer seats;

    @OneToOne
    @JoinColumn(name = "theatreId", referencedColumnName = "theatreId")
    private Theatre theatre;
}
