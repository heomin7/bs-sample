package kr.re.kitri.hello.model;

/**
 * Created by minheo on 2017. 6. 13..
 */
public class Amigo {
    private String amigoId;
    private String name;
    private String phone;
    private String email;

    public String getAmigoId() {
        return amigoId;
    }

    public void setAmigoId(String amigoId) {
        this.amigoId = amigoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoId='" + amigoId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
