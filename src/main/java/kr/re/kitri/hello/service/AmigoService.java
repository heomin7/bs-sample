package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 15..
 */
@Service
public class AmigoService {

    @Autowired
    public AmigoDao dao;

    public void registAmigo(Amigo amigo){

        dao.insertAmigo(amigo);
    }

    /**
     * 글 전체 보기
     * @return 전체 글
     */
    public List<Amigo> viewAmigos(){

        return dao.selectAmigos();
    }

    /**
     * 글 상세 보기
     * @return 글
     */
    public Amigo viewAmigo(String amigoId){

        return dao.selectAmigo(amigoId);
    }
}
