package com.WGQuintrix.helloworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "times_watched")
	private int times_watched;
	
}
