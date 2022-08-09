package org.example;

import org.example.model.Actor;
import org.example.model.Movie;
//import org.example.model.Principal;
//import org.example.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Actor actor = session.get(Actor.class, 1);

            Movie movieToRemove = actor.getMovies().get(0);

            actor.getMovies().remove(0);
            movieToRemove.getActors().remove(actor);

            


//            Movie movie = new Movie("Terminator", 1984);
//            Actor actor1 = new Actor("Arnold Schwarzenegger", 75);
//            Actor actor2 = new Actor("Linda Hamilton", 65);
//
//            movie.setActors(new ArrayList<>(List.of(actor1, actor2)));
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//
//            session.save(movie);
//            session.save(actor1);
//            session.save(actor2);


//
//            Principal principal = session.get(Principal.class,1);
//            School school = session.get(School.class, 1);
//
//         //   school.setPrincipal(principal);
////            Principal principal1 = new Principal("ann", 99);
////            session.save(principal1);
//
//            principal.setSchool(school);
//            session.save(principal);
//            Director director = session.get(Director.class, 1);
//            Movie movie = session.get(Movie.class, 12);
//
//            movie.getDirector().getMovies().remove(movie);
//
//            System.out.println(director.getMovies());
//            movie.setDirector(director);
//            director.setMovies(new ArrayList<>(Collections.singletonList(movie)));

            //  session.save(director);


//            Movie movie = session.get(Movie.class, 15);
//            session.remove(movie);
            //    Director director = session.get(Director.class, 7);
//
//            List<Movie> list = director.getMovies();
//            for (Movie movie : list) {
//                list.remove(movie);
//            }
//
//            director.getMovies().clear();
            //   session.remove(director);
            //  director.getMovies().forEach(i -> i.setDirector(null));


            session.getTransaction().commit();
        }
    }
}
