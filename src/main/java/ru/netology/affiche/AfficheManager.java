package ru.netology.affiche;

public class AfficheManager {
    private MovieNames[] names = new MovieNames[0];

    private int maxLimit = 10;

    AfficheManager() {
    }

    AfficheManager(int newMaxLimit) {
        if (newMaxLimit > 0) {
            maxLimit = newMaxLimit;
        }
    }

    public void addMovie(MovieNames name) {
        MovieNames[] tmp = new MovieNames[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public MovieNames[] findAll() {
        return names;
    }

    public MovieNames[] findLast() {
        int namesLength = names.length;
        if (namesLength < maxLimit) {
            maxLimit = namesLength;
        }
        MovieNames[] reversed = new MovieNames[maxLimit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = names[namesLength - 1 - i];
        }
        return reversed;
    }
}