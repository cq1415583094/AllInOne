package com.hz.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//容器
public class BookList {
    private List<Book> bookList; //存储对象容器
    private int index; //当前遍历状态位置
    private Iterator<Book> iterator; //具有一个迭代的引用

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

    //使用迭代实现容器遍历
    public Iterator<Book> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Book> {

        @Override
        public boolean hasNext() {
            if (index >= bookList.size()) {
                return false;
            }
            return true;
        }

        @Override
        public Book next() {
            return bookList.get(index++);
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Book> action) {

        }
    }
}