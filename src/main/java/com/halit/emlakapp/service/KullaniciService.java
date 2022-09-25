package com.halit.emlakapp.service;

import com.halit.emlakapp.repository.IKullaniciRepository;
import com.halit.emlakapp.repository.entity.Konut;
import com.halit.emlakapp.repository.entity.Kullanici;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class KullaniciService  {

    private final IKullaniciRepository kullaniciRepository;

    public Kullanici save(Kullanici kullanici){
        return kullaniciRepository.save(kullanici);
    }
    public Kullanici update(Kullanici kullanici){
        return kullaniciRepository.save(kullanici);
    }
    public void delete(Kullanici kullanici){
        kullaniciRepository.delete(kullanici);
    }
    public List<Kullanici> findAll(){
        return kullaniciRepository.findAll();
    }
}