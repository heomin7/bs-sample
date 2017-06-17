package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by minheo on 2017. 6. 16..
 */
@Repository
public class PostDao implements BoardDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertPost(Post post) {

        String selectQuery =
                "SELECT member_seq, user_id, password," +
                "email, point, join_date  \n" +
                "FROM member WHERE user_id= ?";

        String insertQuery =
                "insert into post (title, content, write_date, member_seq)\n"+
                        "VALUES (?, ?, now(), ?)";

        Member searchMember = jdbcTemplate.queryForObject(selectQuery,
                (rs, i) -> {
                    Member member = new Member();
                    member.setMemberSeq(rs.getInt(1));
                    member.setUserId(rs.getString(2));
                    member.setPassword(rs.getString(3));
                    member.setEmail(rs.getString(4));
                    member.getPoint(rs.getInt(5));
                    member.getJoinDate(rs.getString(6));
                    return member;
                }, post.getMemberId());


        jdbcTemplate.update(insertQuery,
                post.getTitle(),
                post.getContent(),
                searchMember.getMemberSeq());
    }


    public void insertMember(Member member) {
    }

    public void updatePoint(String memberSeq) {

    }

    @Override
    public List<Post> selectPosts() {
        String query =
                "SELECT post_seq, title, content, " +
                        "CURRENT_DATE, user_id\n" +
                        "FROM post, member\n" +
                        "WHERE member.member_seq = post.member_seq";

        return jdbcTemplate.query(query,
                (rs, i) -> {
                    Post post = new Post();
                    Member member = new Member();
                    post.setPostSeq(rs.getInt(1));
                    post.setTitle(rs.getString(2));
                    post.setContent(rs.getString(3));
                    post.setWriteDate(rs.getString(4));
                    post.setMemberId(rs.getString(5));
                    return post;
                });
    }

    @Override
    public Post selectPost(int postSeq) {
        String query =
                "SELECT post_seq, title, content, CURRENT_DATE, user_id\n" +
                        "FROM post, member\n" +
                        "WHERE member.member_seq = post.member_seq\n" +
                        "AND post_seq = ?";

        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Post post = new Post();
                    post.setPostSeq(rs.getInt(1));
                    post.setTitle(rs.getString(2));
                    post.setContent(rs.getString(3));
                    post.setWriteDate(rs.getString(4));
                    post.setMemberId(rs.getString(5));
                    return post;
                }, postSeq);
    }


}
