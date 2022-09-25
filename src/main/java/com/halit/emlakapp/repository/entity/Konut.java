package com.halit.emlakapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "tblkonut")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Konut {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Long kullaniciId;
    String sehir;
    String ilce;
    int alan;
    int odaSayisi;
    int binaYasi;
    Double fiyat;
    LocalDateTime ilanTarihi;


}
