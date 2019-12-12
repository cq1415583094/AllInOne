package com.hz.ex;

import java.util.Iterator;

//迭代模式实现容器遍历
public class Client {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        Book book1 = new Book("001", "Java In Action", 45);
        Book book2 = new Book("002", "HTML In Action", 56);

        bookList.addBook(book1);
        bookList.addBook(book2);

        Iterator<Book> iterator = bookList.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            book.display();
        }

    }
}