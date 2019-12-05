package com.hz.blog;

import java.util.Observable;

/**
 * 博主类
 */
public class BlogUser extends Observable {

    //发表文章
    public void publishBlog(String articleTitle, String articleContent) {
        Article article = new Article();
        article.setArticleTitle(articleTitle);
        article.setArticleContent(articleContent);

        System.out.println("发布文章完成");
        System.out.println("-----------------");

        this.setChanged();
        this.notifyObservers(article);
    }
}