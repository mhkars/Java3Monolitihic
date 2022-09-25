package com.halit.emlakapp.service;

import com.halit.emlakapp.repository.IAracRepository;
import com.halit.emlakapp.repository.IKonutRepository;
import com.halit.emlakapp.repository.entity.Arac;
import com.halit.emlakapp.repository.entity.Konut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@RequiredArgsConstructor
public class KonutService {

    private final IKonutRepository konutRepository;

    public Konut save(Konut konut){
        konut.setIlanTarihi(LocalDateTime.now());
        return konutRepository.save(konut);
    }
    public Konut update(Konut konut){
        return konutRepository.save(konut);
    }
    public void delete(Konut konut){
        konutRepository.delete(konut);
    }
    public List<Konut> findAll(){
        return konutRepository.findAll();
    }
}
