package ru.netology.affiche;

public class MovieNames {
    private int id;
    private String movieName;
    private String genreMovie;
    private int released;

    public MovieNames(int id, String movieName, String genreMovie, int released) {
        this.id = id;
        this.movieName = movieName;
        this.genreMovie = genreMovie;
        this.released = released;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenreMovie() {
        return genreMovie;
    }

    public void setGenreMovie(String genreMovie) {
        this.genreMovie = genreMovie;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }
}