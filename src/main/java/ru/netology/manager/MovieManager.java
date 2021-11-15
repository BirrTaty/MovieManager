package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];
    private MovieManager[] maxLength = new MovieManager[9];

    public MovieManager() {
        int maxLength = 10;
    }

    public MovieManager(MovieItem[] items, MovieManager[] maxLength) {
        this.items = items;
        this.maxLength = maxLength;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getLastTen() {
        int resultLength;
        if (items.length <= 10) {
            resultLength = items.length;
        } else {
            resultLength = 10;
        }

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}


