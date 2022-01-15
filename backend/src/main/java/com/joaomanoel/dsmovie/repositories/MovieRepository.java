package com.joaomanoel.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomanoel.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
