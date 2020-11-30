package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library extends Prototype {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String s = " Library [" + name + " ] \n";
        for (Book bookList : books) {
            s = s + bookList.toString() + "\n";
        }

        return s;
    }

    public Book addBook(Book book) {
        return book;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {

        Library clonedLibrary = (Library) super.clone();

        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {

            Book clonedBooks = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());

            clonedLibrary.getBooks().add(clonedBooks);
        }

        return clonedLibrary;
    }

}
