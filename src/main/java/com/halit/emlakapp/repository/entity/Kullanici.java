package com.halit.emlakapp.repository.entity;

import lombok.*;
import javax.persistence.*;

@Table(name="tblkullanici")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int dogumTarihi;
    String email;
    String kullaniciAdi;
    String sifre;

}
