package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library(" no. 1 Library");

        Book book = new Book("title", "Mickiewicz", LocalDate.of(2003, 4, 16));
        Book book1 = new Book("title2", "Mickiewicz2", LocalDate.of(2002, 6, 12));
        Book book2 = new Book("title3", "Mickiewicz3", LocalDate.of(2001, 3, 17));

        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);

//shallow copy
        Library cloned = null;
        try {
            cloned = library.shallowCopy();
            cloned.setName("shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//deep copy
        Library deepCloned = null;
        try {
            deepCloned = library.deepCopy();
            deepCloned.setName("deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book);

        //Then
        System.out.println(library);
        System.out.println(cloned);
        System.out.println(deepCloned);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, cloned.getBooks().size());
        Assert.assertEquals(3, deepCloned.getBooks().size());

    }

}
