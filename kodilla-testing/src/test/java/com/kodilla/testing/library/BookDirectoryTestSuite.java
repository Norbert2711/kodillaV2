package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    public List<Book> bookGenerator(int bookQuantity) {

        List<Book> bookListGenerated = new ArrayList<>();
        for (int i = 0; i < bookQuantity; i++) {
            Book generatedBook = new Book("Title" + i, "Author" + i, 2000 + i);
            bookListGenerated.add(generatedBook);
        }
        return bookListGenerated;
    }


    @Test
    public void testListBooksWithConditionsReturnList() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(bookList);

        //When
        List<Book> resultBook = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, resultBook.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = bookGenerator(15);
        List<Book> resultListOf40Books = bookGenerator(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = bookGenerator(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void userDontHaveAnyBooks() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = bookGenerator(0);
        LibraryUser libraryUser = new LibraryUser("Adam", "Malysz",
                "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOf0Books);

        //When
        int result = libraryDatabaseMock.listBooksInHandsOf(libraryUser).size();
        System.out.println(result);
        System.out.println(resultListOf0Books);

        //Then
        assertEquals(0, result);

    }

    @Test
    public void userHave1Book() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf1Books = bookGenerator(1);
        LibraryUser libraryUser = new LibraryUser("Adam", "Malysz",
                "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOf1Books);

        //When
        int result = libraryDatabaseMock.listBooksInHandsOf(libraryUser).size();
        System.out.println(result);
        System.out.println(resultListOf1Books);
        //Then
        assertEquals(1, result);

    }

    @Test
    public void userHave5Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = bookGenerator(5);
        LibraryUser libraryUser = new LibraryUser("Adam", "Malysz",
                "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOf5Books);

        //When
        int result = libraryDatabaseMock.listBooksInHandsOf(libraryUser).size();
        System.out.println(result);
        System.out.println(resultListOf5Books);

        //Then
        assertEquals(5, result);

    }
}
