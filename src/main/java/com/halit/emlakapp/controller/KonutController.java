package com.halit.emlakapp.controller;

import com.halit.emlakapp.repository.entity.Konut;
import com.halit.emlakapp.service.KonutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/konut")
@RequiredArgsConstructor
public class KonutController {
    private final KonutService konutService;

    @RequestMapping("/save")
    public String save(Long kullaniciId,String sehir,String ilce,int alan,int odaSayisi,int binaYasi,Double fiyat){
        Konut konut = new Konut().builder()
                .kullaniciId(kullaniciId)
                .sehir(sehir)
                .ilce(ilce)
                .alan(alan)
                .odaSayisi(odaSayisi)
                .binaYasi(binaYasi)
                .fiyat(fiyat)
                .build();
        konutService.save(konut);
        return"Konut ilanı kaydedildi";
    }
    @RequestMapping("/findall")
    public List<Konut> findAll(){
        return konutService.findAll();
    }
}
