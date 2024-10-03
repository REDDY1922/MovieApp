package com.example.movieApi.Models;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	@Column(nullable = false,length=200)//db level validation
	@NotBlank(message="please provide movie title")//application level validation
	private String title;
	@Column(nullable = false)//db level validation
	@NotBlank(message="please provide movie's director")//application level validation
	private String director;
	@Column(nullable = false)//db level validation
	@NotBlank(message="please provide movie's studio")//application level validation
	private String studio;
	@ElementCollection
	@CollectionTable(name="movie_cast")
	private Set<String> cast;
	@Column(nullable = false)//db level validation
	@NotBlank(message="please provide movie's ")//application level validation
	private int releaseYear;
	@Column(nullable = false)//db level validation
	@NotBlank(message="please provide movie's poster")//application level validation
	private String poster;
}
