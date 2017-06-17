package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
public interface ArticleDao {

    void insertArticle(Article article);
    Article selectArticle(String articleId);
    List<Article> selectArticles();

}
