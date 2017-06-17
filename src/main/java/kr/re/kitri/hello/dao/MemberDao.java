package kr.re.kitri.hello.dao;

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
public class MemberDao implements BoardDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertPost(Post post) {

    }

    @Override
    public void insertMember(Member member) {
        String query =
                "INSERT INTO member(user_id, password, " +
                        "email, point, join_date)\n" +
                        "VALUES(?, ?, " +
                        "?, 0, CURRENT_DATE);";

        jdbcTemplate.update(query,
                member.getUserId(),
                member.getPassword(),
                member.getEmail());

    }

    @Override
    public void updatePoint(String memberId) {

        String query =
                "SELECT member_seq, user_id, password" +
                ", email, point, join_date\n" +
                "FROM member\n" +
                "WHERE user_id = ?";

        String insertQuery = "UPDATE member SET point = point+10\n" +
                "WHERE member_seq = ?";

        Member searchMember = jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Member member = new Member();
                    member.setMemberSeq(rs.getInt(1));
                    member.setUserId(rs.getString(2));
                    member.setPassword(rs.getString(3));
                    member.setEmail(rs.getString(4));
                    member.setPoint(rs.getInt(5));
                    member.setUserId(rs.getString(6));
                    return member;
                }, memberId);

        jdbcTemplate.update(insertQuery, searchMember.getMemberSeq());


    }


    public List<Post> selectPosts() {
        return null;
    }



    public Post selectPost(int postSeq) {
        return null;
    }

}
