package com.halit.emlakapp.controller;

import com.halit.emlakapp.repository.entity.Arac;
import com.halit.emlakapp.repository.entity.Kullanici;
import com.halit.emlakapp.service.AracService;
import com.halit.emlakapp.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/arac")
@RequiredArgsConstructor
public class AracController {

    private final AracService aracService;

    @GetMapping("/save")
    public String saveArac(Long kullaniciId,String sehir,String marka,String model,
                           int yil,int km,Double fiyat) {
        Arac arac= Arac.builder()
                .kullaniciId(kullaniciId)
                .sehir(sehir)
                .marka(marka)
                .model(model)
                .yil(yil)
                .km(km)
                .fiyat(fiyat)
                .build();
        aracService.save(arac);
        return "Arac ilanı kaydedildi" ;
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Arac>> findAll(){
        return ResponseEntity.ok(aracService.findAll());
    }
}
