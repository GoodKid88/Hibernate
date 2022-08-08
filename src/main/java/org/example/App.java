package org.example;

import org.example.model.Principal;
import org.example.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Principal.class)
                .addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Principal principal = session.get(Principal.class,1);
            School school = session.get(School.class, 1);

         //   school.setPrincipal(principal);
//            Principal principal1 = new Principal("ann", 99);
//            session.save(principal1);

            principal.setSchool(school);
            session.save(principal);




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
        } finally {
            sessionFactory.close();
        }
    }
}
