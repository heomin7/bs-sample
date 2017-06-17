package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
@Service
public class PostService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private PostDao postDao;
    /**
     * 글을 등록하고 멤버의 포인트를 10점 준다.
     * @param post
     * @return
     */
    public void registPost(Post post) {
        postDao.insertPost(post);
        memberDao.updatePoint(post.getMemberId());
    }

    public void registMember(Member member){
        memberDao.insertMember(member);
    }

    public List<Post> viewPosts(){
        return postDao.selectPosts();
    }

    public Post viewPost(int postSeq){
        return postDao.selectPost(postSeq);
    }
}
