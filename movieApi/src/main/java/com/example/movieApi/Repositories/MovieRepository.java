package com.example.movieApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieApi.Models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
