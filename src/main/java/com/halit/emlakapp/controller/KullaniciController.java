package com.halit.emlakapp.controller;


import com.halit.emlakapp.repository.entity.Kullanici;
import com.halit.emlakapp.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
@RequiredArgsConstructor
public class KullaniciController {
    private final KullaniciService kullaniciService;

    @GetMapping("/save")
    public String saveMusteri(String ad, String soyad, String adres,String telefon,
                              int dogumTarihi,String email, String kullaniciAdi,String sifre) {
        Kullanici kullanici= Kullanici.builder()
                .ad(ad)
                .soyad(soyad)
                .adres(adres)
                .telefon(telefon)
                .dogumTarihi(dogumTarihi)
                .email(email)
                .kullaniciAdi(kullaniciAdi)
                .sifre(sifre)
                .build();
        kullaniciService.save(kullanici);
        return "Musteri Kaydedildi" ;
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Kullanici>> findAll(){
        return ResponseEntity.ok(kullaniciService.findAll());
    }


}
