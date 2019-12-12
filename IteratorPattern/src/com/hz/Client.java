package com.hz;

import java.util.List;

//无迭代时我们常用容器遍历方式有两种
//一种是容器自己实现遍历   另一种是客户端自己实现遍历
public class Client {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        Book book1 = new Book("001", "Java In Action", 45);
        Book book2 = new Book("002", "HTML In Action", 56);

        bookList.addBook(book1);
        bookList.addBook(book2);

        //容器自身实现遍历
        bookList.getAllBook();

        System.out.println("----------------------------");
        //客户端自己实现遍历
        List<Book> books = bookList.getBookList();
        for (Book book : books) {
            book.display();
        }

    }
}