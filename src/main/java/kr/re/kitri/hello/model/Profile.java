package kr.re.kitri.hello.model;

/**
 * Created by minheo on 2017. 6. 14..
 */
public class Profile {
    private String name;
    private String age;
    private String role;
    private String careerYear;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCareerYear() {
        return careerYear;
    }

    public void setCareerYear(String careerYear) {
        this.careerYear = careerYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", role='" + role + '\'' +
                ", careerYear='" + careerYear + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
