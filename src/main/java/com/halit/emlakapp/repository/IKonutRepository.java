package com.halit.emlakapp.repository;

import com.halit.emlakapp.repository.entity.Konut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKonutRepository extends JpaRepository<Konut,Long> {
}
