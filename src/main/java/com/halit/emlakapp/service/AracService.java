package com.halit.emlakapp.service;

import com.halit.emlakapp.repository.IAracRepository;
import com.halit.emlakapp.repository.entity.Arac;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AracService {

    private final IAracRepository aracRepository;
    public Arac save(Arac arac){
        arac.setIlanTarihi(LocalDateTime.now());
        return aracRepository.save(arac);
    }
    public Arac update(Arac arac){
        return aracRepository.save(arac);
    }
    public void delete(Arac arac){
        aracRepository.delete(arac);
    }
    public List<Arac> findAll(){
        return aracRepository.findAll();
    }



}
