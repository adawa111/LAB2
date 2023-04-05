package com.example.lab2.repository;

import com.example.lab2.entity.Concierto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ConciertoRepository
        extends JpaRepository<Concierto, Integer> {



}