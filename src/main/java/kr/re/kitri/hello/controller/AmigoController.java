package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * /amigo .. 친구 전체보기
 * /amigo/regist (GET) ..친구 등록화면으로 이동
 * /amigo/regist (POST) ..친구 등록
 * /amigo/{id} ..친구 상세보기
 * /amigo/{id}/modify (GET) ..친구 수정하기 화면으로 이동
 * /amigo/{id}/modify(POST) ..친구 수정하기
 * /amigo/{id}/remove (GET) ..친구 삭제하기
 *
 *
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {
    @Autowired
    private AmigoService service;

    @RequestMapping("")
    public ModelAndView AmigoRegistAll(){

        List<Amigo> list = service.viewAmigos();

        return new ModelAndView("/amigo/amigo_regist_all")
                .addObject(list);
    }

    @RequestMapping("/{amigoId}")
    public ModelAndView AmigoRegistDetal(@PathVariable("amigoId") String amigoId){

        Amigo amigo = service.viewAmigo(amigoId);

        System.out.println(amigo);
        return new ModelAndView("amigo/amigo_regist_id")
                .addObject(amigo);

    }

    @GetMapping("/regist")
    public String AmigoRegist(){

        return "amigo/amigo_regist";
    }

    @PostMapping("/regist")
    public ModelAndView GoAimgoRegist(Amigo amigo){

        System.out.println(amigo);

        service.registAmigo(amigo);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_regist_go");
        mav.addObject(amigo);

        return mav;
    }

}
