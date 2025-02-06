package com.reservationsmile.reservationplace_smile.reservation.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "desk")
@Data
public class desk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int floor;
    @Column(nullable = false, unique = true)
    int desknumber;
    boolean available;
}