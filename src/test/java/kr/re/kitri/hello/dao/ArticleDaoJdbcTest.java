package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 14..
 */

public class ArticleDaoJdbcTest {

    private ApplicationContext context;

    @Before
    public void setup(){
        context =
                new ClassPathXmlApplicationContext(
                        "classpath:spring/db.xml"
                        , "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testInsertArticle(){
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);

        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("테스트케이스");
        article.setWriter("tc");
        article.setContent("테스트케이스 입니다");

        dao.insertArticle(article);
    }

    @Test
    public void testSelectArticles(){
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        List<Article> list = dao.selectArticles();
        Assert.assertTrue(list.size() > 0);
        Assert.assertTrue(list.get(0).getWriter().equals("kim"));
        System.out.println(list.size());
    }

    @Test
    public void testSelectArticle(){
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        Article article = dao.selectArticle("2");
        Assert.assertTrue(article.getWriter().equals("lee"));
    }
}
