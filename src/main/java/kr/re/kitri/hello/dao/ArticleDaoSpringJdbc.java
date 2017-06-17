package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
@Repository
public class ArticleDaoSpringJdbc implements ArticleDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {
        String query =
                "insert into article (article_id, title, writer, content)\n"+
                        "VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(query,
                Integer.parseInt(article.getArticleId()),
                article.getTitle(),
                article.getWriter(),
                article.getContent());
    }


    @Override
    public Article selectArticle(String articleId) {
        String query = "SELECT article_id, title, writer, content\n" +
                "FROM article\n" +
                "WHERE article_id = ?";

        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setWriter(rs.getString(3));
                article.setContent(rs.getString(4));
                return article;
        }, Integer.parseInt(articleId));
    }

    @Override
    public List<Article> selectArticles() {
        String query =
                "SELECT article_id, title, writer, content\n" +
                "FROM article";

        return jdbcTemplate.query(query,
                (rs, i) -> {
                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setWriter(rs.getString(3));
                article.setContent(rs.getString(4));
                return article;
        });
    }
}
