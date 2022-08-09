package org.example.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;

//    @ManyToOne
//    @JoinColumn(name = "director_id", referencedColumnName = "director_id")
//    private Director director;

    @Column(name = "name")
    private String name;

    @Column(name = "year_of_production")
    private int year_of_production;

    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;

    public Movie(){}

    public Movie(String name, int year_of_production) {
        this.name = name;
        this.year_of_production = year_of_production;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

//    public Director getDirector() {
//        return director;
//    }
//
//    public void setDirector(Director director) {
//        this.director = director;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", name='" + name + '\'' +
                ", year_of_production=" + year_of_production +
                ", actors=" + actors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movie_id == movie.movie_id && year_of_production == movie.year_of_production && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, name, year_of_production);
    }
}
