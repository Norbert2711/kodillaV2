package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<>();

        if (titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;

        bookList = resultList;

        return bookList;

    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> bookInHand = new ArrayList<>();
        if (bookInHand.size() == 0) return bookInHand;

        List<Book> booksInHand = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (booksInHand.size() != 0)
            bookInHand = booksInHand;

        return bookInHand;
    }

}
