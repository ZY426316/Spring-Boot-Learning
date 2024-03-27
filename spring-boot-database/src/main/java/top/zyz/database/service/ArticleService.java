package top.zyz.database.service;

import top.zyz.database.entity.Article;

import java.util.List;

public interface ArticleService {
    Article saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}

