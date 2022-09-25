package com.halit.emlakapp.repository;

import com.halit.emlakapp.repository.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKullaniciRepository extends JpaRepository<Kullanici, Long> {

}


