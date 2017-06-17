package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
public interface BoardDao {

    void insertPost(Post post);
    void insertMember(Member member);
    void updatePoint(String memberSeq);
    List<Post> selectPosts();
    Post selectPost(int postSeq);

}
