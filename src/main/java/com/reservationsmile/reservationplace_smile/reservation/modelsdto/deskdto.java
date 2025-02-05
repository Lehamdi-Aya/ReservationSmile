package com.reservationsmile.reservationplace_smile.reservation.modelsdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class deskdto {
    private int id;
    private int etage;
    private int numero_de_place;
    private boolean etat_disponible;
}