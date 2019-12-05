package com.hz.blog;

/**
 * 博客文章类
 */
public class Article {
    private String articleTitle; //标题
    private String articleContent; //内容

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}