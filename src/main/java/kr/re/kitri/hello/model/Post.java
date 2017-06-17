package kr.re.kitri.hello.model;

/**
 * Created by minheo on 2017. 6. 16..
 */
public class Post {
    private int postSeq;
    private String title;
    private String memberId;
    private String content;
    private String writeDate;
    private int memberSeq;

    public int getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(int postSeq) {
        this.postSeq = postSeq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postSeq=" + postSeq +
                ", title='" + title + '\'' +
                ", memberId='" + memberId + '\'' +
                ", content='" + content + '\'' +
                ", writeDate='" + writeDate + '\'' +
                ", memberSeq=" + memberSeq +
                '}';
    }
}
