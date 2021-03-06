package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
        {"classpath:spring/applicationContext.xml",
                "classpath:spring/db.xml"})
public class ArticleDaoSpringJdbcTest {

    @Autowired
    private ArticleDaoSpringJdbc articleDao;

    @Test
    public void testSelectArticles(){
        List<Article> list = articleDao.selectArticles();
        System.out.println(list);
        Assert.assertTrue(list.size() > 2);
    }

    @Test
    public void testSelectArticle(){
        Article article = articleDao.selectArticle("3");
        System.out.println(article);
        Assert.assertTrue(article.getArticleId().equals("3"));
    }

    @Test
    public void testInsertArticle(){
        Article article = new Article();
        article.setArticleId("10");
        article.setTitle("a");
        article.setWriter("kim");
        article.setContent("test case");
        articleDao.insertArticle(article);


    }
}
