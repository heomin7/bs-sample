package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minheo on 2017. 6. 13..
 */
public class MockAmigo {
    public List<Amigo> getAmigo(){
        List<Amigo> list = new ArrayList<>();

        Amigo a = new Amigo();
        a.setName("허민");
        a.setPhone("010101");
        a.setEmail("min@naver.com");
        list.add(a);

        a = new Amigo();
        a.setName("황순성");
        a.setPhone("010102");
        a.setEmail("sunsueng@naver.com");
        list.add(a);

        a = new Amigo();
        a.setName("김세원");
        a.setPhone("010103");
        a.setEmail("seawon@naver.com");
        list.add(a);

        a = new Amigo();
        a.setName("김태준");
        a.setPhone("010104");
        a.setEmail("taejoon@naver.com");
        list.add(a);

        return list;
    }
}
