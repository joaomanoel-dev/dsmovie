package com.joaomanoel.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomanoel.dsmovie.entities.Score;
import com.joaomanoel.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
