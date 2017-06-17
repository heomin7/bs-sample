package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by minheo on 2017. 6. 16..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
        {"classpath:spring/applicationContext.xml",
                "classpath:spring/db.xml"})
public class PostDaoTest {

    @Autowired
    private PostDao dao;

    @Test
    public void testInserPost(){
        Post post = new Post();
        post.setTitle("test");
        post.setContent("unit test");
        post.setMemberId("tjocee33");
        dao.insertPost(post);
    }
}
