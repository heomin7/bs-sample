package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
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
 * Created by minheo on 2017. 6. 15..
 */
@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;

    public void insertAmigo(Amigo amigo){


        try {
            //1. connection 확보
            Connection conn = dataSource.getConnection();

            //2. 쿼리를 생성 = preparedstatement
            String query =
                    "INSERT INTO amigo (name, phone, email)\n"+
                            "VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, amigo.getName());
            pstmt.setString(2, amigo.getPhone());
            pstmt.setString(3, amigo.getEmail());

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
    public List<Amigo> selectAmigos(){
        List<Amigo> amigos = new ArrayList<>();

        String query ="SELECT amigo_id, " +
                "name, " +
                "phone, " +
                "email " +
                "FROM amigo";

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            Amigo amigo = null;
            while(rs.next()){
                amigo = new Amigo();
                amigo.setAmigoId(rs.getString(1));
                amigo.setName(rs.getString(2));
                amigo.setPhone(rs.getString(3));
                amigo.setEmail(rs.getString(4));
                amigos.add(amigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amigos;
    }

    /**
     * 글 상세 보기
     * @return
     */
    public Amigo selectAmigo(String amigoId) {

        Amigo amigo = new Amigo();

        String query = "SELECT article_id, title, writer, content\n" +
                "FROM article\n" +
                "WHERE article_id = ?";

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(amigoId));

            ResultSet rs = pstmt.executeQuery();

            rs.next();
            amigo.setAmigoId(rs.getString(1));
            amigo.setName(rs.getString(2));
            amigo.setPhone(rs.getString(3));
            amigo.setEmail(rs.getString(4));

            conn.close();
            return amigo;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
