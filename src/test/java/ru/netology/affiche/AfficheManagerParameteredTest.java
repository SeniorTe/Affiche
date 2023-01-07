package ru.netology.affiche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheManagerParameteredTest {

    MovieNames movie1 = new MovieNames(1, "Бладшот", "боевик", 2020);
    MovieNames movie2 = new MovieNames(2, "Вперед", "мультфильм", 2020);
    MovieNames movie3 = new MovieNames(3, "Отель Белград", "комедия", 2020);
    MovieNames movie4 = new MovieNames(4, "Джентельмены", "боевик", 2020);
    MovieNames movie5 = new MovieNames(5, "Человек - невидимка", "ужасы", 2020);
    MovieNames movie6 = new MovieNames(6, "Тролли. Мировой тур", "мультфильм", 2020);
    MovieNames movie7 = new MovieNames(7, "Чебурашка", "семейный", 2022);
    MovieNames movie8 = new MovieNames(8, "Непослушник 2", "комедия", 2022);
    MovieNames movie9 = new MovieNames(9, "Иван Царевич и Серый Волк 5", "мультфильм", 2022);
    MovieNames movie10 = new MovieNames(10, "Мира", "фантастика", 2022);
    MovieNames movie11 = new MovieNames(11, "Астрал: Потомство", "ужасы", 2022);
    MovieNames movie12 = new MovieNames(12, "Призрачный дом", "ужасы", 2022);

    @Test
    public void shouldReturnReverseAllMoviesLimit5() {

        AfficheManager affiche = new AfficheManager(5);

        affiche.addMovie(movie1);
        affiche.addMovie(movie2);
        affiche.addMovie(movie3);
        affiche.addMovie(movie4);
        affiche.addMovie(movie5);
        affiche.addMovie(movie6);
        affiche.addMovie(movie7);
        affiche.addMovie(movie8);
        affiche.addMovie(movie9);
        affiche.addMovie(movie10);
        affiche.addMovie(movie11);
        affiche.addMovie(movie12);

        MovieNames[] expected = {movie12, movie11, movie10, movie9, movie8};
        MovieNames[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverseAllMoviesLimit5ElseAdd4Movie() {

        AfficheManager affiche = new AfficheManager(5);

        affiche.addMovie(movie1);
        affiche.addMovie(movie2);
        affiche.addMovie(movie3);
        affiche.addMovie(movie4);

        MovieNames[] expected = {movie4, movie3, movie2, movie1};
        MovieNames[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverseAllMoviesLimit11() {

        AfficheManager affiche = new AfficheManager(11);

        affiche.addMovie(movie1);
        affiche.addMovie(movie2);
        affiche.addMovie(movie3);
        affiche.addMovie(movie4);
        affiche.addMovie(movie5);
        affiche.addMovie(movie6);
        affiche.addMovie(movie7);
        affiche.addMovie(movie8);
        affiche.addMovie(movie9);
        affiche.addMovie(movie10);
        affiche.addMovie(movie11);
        affiche.addMovie(movie12);

        MovieNames[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        MovieNames[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverseAllMoviesLimitNegativeParameter() {

        AfficheManager affiche = new AfficheManager(-3);

        affiche.addMovie(movie1);
        affiche.addMovie(movie2);
        affiche.addMovie(movie3);
        affiche.addMovie(movie4);
        affiche.addMovie(movie5);
        affiche.addMovie(movie6);
        affiche.addMovie(movie7);
        affiche.addMovie(movie8);
        affiche.addMovie(movie9);
        affiche.addMovie(movie10);
        affiche.addMovie(movie11);
        affiche.addMovie(movie12);

        MovieNames[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        MovieNames[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}