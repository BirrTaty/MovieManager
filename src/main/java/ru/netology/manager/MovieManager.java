package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private int limit;
    private MovieItem[] items = new MovieItem[0];

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
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
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}


