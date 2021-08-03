package org.superops.demo.moviebooking.model.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "USER")
public class User {

    @Id
    private Long userId;
    private String userName;
    private String fullName;
    private String email;
    private String contactNumber;
}
