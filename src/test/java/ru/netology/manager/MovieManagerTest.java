package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {



    @Test
    public void shouldGetOneMovie() {
        MovieManager movieManager = new MovieManager();
        MovieItem first = new MovieItem(1, "first", "comedy", "123.img");
        movieManager.add(first);

        MovieItem[] actual = movieManager.getLastTen();
        MovieItem[] expected = new MovieItem[]{first};

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldGetFiveLastMovie() {
        MovieManager movieManager = new MovieManager();
        MovieItem first = new MovieItem(1,"first","comedy","123.img");
        MovieItem second = new MovieItem(2,"second","comedy","123.img");
        MovieItem third = new MovieItem(3,"third","comedy","123.img");
        MovieItem fourth = new MovieItem(4,"fourth","comedy","123.img");
        MovieItem fifth = new MovieItem(5,"fifth","comedy","123.img");
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);

        MovieItem[] actual = movieManager.getLastTen();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldGetTenLastMovie() {
        MovieManager movieManager = new MovieManager();
        MovieItem first = new MovieItem(1,"first","comedy","123.img");
        MovieItem second = new MovieItem(2,"second","comedy","123.img");
        MovieItem third = new MovieItem(3,"third","comedy","123.img");
        MovieItem fourth = new MovieItem(4,"fourth","comedy","123.img");
        MovieItem fifth = new MovieItem(5,"fifth","comedy","123.img");
        MovieItem sixth = new MovieItem(6,"sixth","comedy","123.img");
        MovieItem seventh = new MovieItem(7,"seventh","comedy","123.img");
        MovieItem eighth = new MovieItem(8,"eighth","comedy","123.img");
        MovieItem ninth = new MovieItem(9,"ninth","comedy","123.img");
        MovieItem tenth = new MovieItem(10,"tenth","comedy","123.img");
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);

        MovieItem[] actual = movieManager.getLastTen();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldGetTenLastMovieThenOverLimit() {
        MovieManager movieManager = new MovieManager();
        MovieItem first = new MovieItem(1, "first", "comedy", "123.img");
        MovieItem second = new MovieItem(2, "second", "comedy", "123.img");
        MovieItem third = new MovieItem(3, "third", "comedy", "123.img");
        MovieItem fourth = new MovieItem(4, "fourth", "comedy", "123.img");
        MovieItem fifth = new MovieItem(5, "fifth", "comedy", "123.img");
        MovieItem sixth = new MovieItem(6, "sixth", "comedy", "123.img");
        MovieItem seventh = new MovieItem(7, "seventh", "comedy", "123.img");
        MovieItem eighth = new MovieItem(8, "eighth", "comedy", "123.img");
        MovieItem ninth = new MovieItem(9, "ninth", "comedy", "123.img");
        MovieItem tenth = new MovieItem(10, "tenth", "comedy", "123.img");
        MovieItem eleventh = new MovieItem(11, "tenth", "comedy", "123.img");
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);


        MovieItem[] actual = movieManager.getLastTen();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }


}