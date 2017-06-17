package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 15..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
        {"classpath:spring/applicationContext.xml",
        "classpath:spring/db.xml"})
public class AmigoDaoTest {
    private ApplicationContext context;

    @Autowired
    private AmigoDao dao;

    @Test
    public void testInsertAmigo(){
        Amigo amigo = new Amigo();
        amigo.setName("lee");
        amigo.setPhone("010-222-333");
        amigo.setEmail("bbb@ccc");

        dao.insertAmigo(amigo);

    }

    @Test
    public void testSelectAmigos(){
        List<Amigo> list = dao.selectAmigos();
        Assert.assertTrue(list.size() > 0);
        Assert.assertTrue(list.get(0).getName().equals("kang"));
        System.out.println(list.size());
    }
}
