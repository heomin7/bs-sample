package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by minheo on 2017. 6. 14..
 */

public class ArticleDaoJdbc implements ArticleDao{

    @Autowired
    private DataSource dataSource;

    /**
     * 글 입력
     * @param article
     */
    public void insertArticle(Article article){

        try {
            //1. connection 확보
            Connection conn = dataSource.getConnection();

            //2. 쿼리를 생성 = preparedstatement
            String query =
                    "insert into article (article_id, title, writer, content)\n"+
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(article.getArticleId()));
            pstmt.setString(2, article.getTitle());
            pstmt.setString(3, article.getWriter());
            pstmt.setString(4, article.getContent());

            pstmt.executeUpdate();

            conn.close();
            System.out.println("insert ok...");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /**
     * 글 전제 보기
     * @return
     */
    public List<Article> selectArticles(){

        List<Article> articles = new ArrayList<>();
        try {
            //1. connection 확보
            Connection conn = dataSource.getConnection();

            //2.쿼리를 생성
            String query =
                    "SELECT article_id, " +
                            "title, " +
                            "writer, " +
                            "content " +
                            "FROM article";

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs =
                    pstmt.executeQuery();

            Article article = null;
            while(rs.next()){
                article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setWriter(rs.getString(3));
                article.setContent(rs.getString(4));
                articles.add(article);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    /**
     * 글 상세 보기
     * @return
     */
    public Article selectArticle(String articleId) {

        String query = "SELECT article_id, title, writer, content\n" +
                "FROM article\n" +
                "WHERE article_id = ?";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(articleId));
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Article article = new Article();
            article.setArticleId(rs.getString(1));
            article.setTitle(rs.getString(2));
            article.setWriter(rs.getString(3));
            article.setContent(rs.getString(4));

            conn.close();
            return article;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
