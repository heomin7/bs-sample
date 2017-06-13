package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minheo on 2017. 6. 12..
 */
@Controller
public class AmigoController {

    @RequestMapping("/amigo/regist/all")
    public ModelAndView AmigoRegistAll(){

        MockAmigo mockAmigo = new MockAmigo();
        List<Amigo> list = mockAmigo.getAmigo();

        return new ModelAndView("/amigo/amigo_regist_all")
                .addObject("list", list);
    }

    @RequestMapping(value = "/amigo/regist/{id}", method = RequestMethod.GET)
    public ModelAndView AmigoRegistId(@PathVariable("id") String id){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_regist_id");
        mav.addObject("id", id);
        return mav;
    }

    @RequestMapping(value = "/amigo/regist", method = RequestMethod.GET)
    public String AmigoRegist(){

        return "amigo/amigo_regist";
    }

    @RequestMapping(value = "/amigo/regist", method= RequestMethod.POST)
    public ModelAndView GoAimgoRegist(
            @RequestParam String name, //생략이 가능
            @RequestParam("phone") String phone,
            @RequestParam("email") String email

    ){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_regist_go");
        mav.addObject("name", name);
        mav.addObject("phone", phone);
        mav.addObject("email", email);

        return mav;
    }

}
