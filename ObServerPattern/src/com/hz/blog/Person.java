package com.hz.blog;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅博客的人类
 */
public class Person implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Article) {
            Article article = (Article) arg;
            System.out.println("博主发表了一篇文章，文章标题为：" + article.getArticleTitle());
        }
    }
}