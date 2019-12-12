package com.hz;

import java.util.ArrayList;
import java.util.List;

//容器
public class BookList {
    private List<Book> bookList; //存储对象容器
    private int index; //当前遍历状态位置

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        return this.bookList.add(book);
    }

    public Book deleteBook(Book book) {
        int i = this.bookList.indexOf(book);
        return this.bookList.remove(i);
    }

    //以上方法可以是容器本身的功能，下面的方法是可以优化的

    //容器是否有下一个节点
    public boolean hasNext() {
        if (index >= this.bookList.size()) {
            return false;
        }
        return true;
    }

    //获取容器中的下一个节点
    public Book next() {
        return bookList.get(index++);
    }

    //遍历容器
    public void getAllBook() {
        while (this.hasNext()) {
            Book book = this.next();
            book.display();
        }
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}