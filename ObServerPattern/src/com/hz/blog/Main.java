package com.hz.blog;

public class Main {
    public static void main(String[] args) {
        BlogUser blogUser = new BlogUser();
        blogUser.addObserver(new Person());
        blogUser.publishBlog("我的第一篇博客", "这是我的首篇博客，欢迎大家来访问。");
    }
}