package com.kodilla.stream.lambda;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(4, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(12, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(4, 66, (a, b) -> a * b);
        expressionExecutor.executeExpression(64, 16, (a, b) -> a / b);

        System.out.println("   *   *   *   ");
        expressionExecutor.executeExpression(4, 50, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(120, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(40, 66, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(64, 160, FunctionalCalculator::divideAByB);

        System.out.println("   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Original Text1: ", text -> text.toUpperCase());
        poemBeautifier.beautify("Original Text2: ", text -> text.toLowerCase());
        poemBeautifier.beautify("Original Text3 ", text -> text.toLowerCase() + "ABC");
        poemBeautifier.beautify("Original Text4 ", text -> text.toUpperCase() + "ABC");
        poemBeautifier.beautify("ABC ", text -> text.toLowerCase() + "Original Text5");

        System.out.println(" ******************** STREAM ITERATE **************");

        NumbersGenerator.generateEven(80);

        System.out.println(" ******************** STREAM LIST **************");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(a -> a.length() > 11)
                .map(a -> a.substring(0, a.indexOf(' ') + 2) + ". ")
                .filter(a -> a.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        System.out.println(" ******************** STREAM BOOK LIST **************");

        BookDirectory bookDirectory = new BookDirectory();
        Map<String, Book> resultOfBooks = bookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("Elements: " + resultOfBooks.size());

        resultOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println(" ******************** STREAM BOOK LIST2 **************");

        BookDirectory theBookDirectory1 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory1.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);


    }

}
