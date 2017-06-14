package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.model.Profile;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by minheo on 2017. 6. 14..
 */
public class MockProfile {
    public List<Profile> getProfile() {

        List<Profile> profiles = new ArrayList<>();
        Profile p = new Profile();
        p.setName("허민");
        p.setAge("30");
        p.setRole("Project Manager");
        p.setCareerYear("3");
        p.setPosition("대리");
        profiles.add(p);

        p.setName("김세원");
        p.setAge("27");
        p.setRole("hadoop engineer");
        p.setCareerYear("3");
        p.setPosition("대리");
        profiles.add(p);

        p.setName("황순성");
        p.setAge("27");
        p.setRole("UI/UX developer");
        p.setCareerYear("3");
        p.setPosition("대리");
        profiles.add(p);

        p.setName("김태준");
        p.setAge("27");
        p.setRole("Hadoop Engineer");
        p.setCareerYear("3");
        p.setPosition("대리");
        profiles.add(p);

        return profiles;
    }
}
