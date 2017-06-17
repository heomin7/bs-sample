package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * /bbs ..전체보기
 * /bbs/{articleId} .. 상세보기(15번 글)
 * /bbs/{articleId}/modify ..수정(15번 글 수정)
 * /bbs/{articleId}/remove .. 삭제(15번 글 삭제)
 *
 * /bbs/write .. 글 작성화면 로딩
 * /bbs/write/do .. 글 작성하기
 *
 */
@Controller
@RequestMapping("/bbs")
public class BbsController {
    @Autowired
    private BbsService service;

    @RequestMapping("")
    public ModelAndView viewAll(){

        //전체 보기를 하기위한 데이터를 가져온다.
        List<Article> list = service.viewArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list", list);
    }

    /**
     * 글 상세 보기
     * @param articleId
     * @return
     */
    @RequestMapping("/{articleId}")
    public ModelAndView bbsdetail(@PathVariable("articleId") String articleId){

        Article article= service.viewArticle(articleId);

        ModelAndView mav = new ModelAndView();
        return  new ModelAndView("bbs/bbs_detail").addObject(article);
    }

    @RequestMapping("/{articleId}/modify")
    public ModelAndView modify(@PathVariable("articleId") String articleId){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_detail_modify");
        mav.addObject("articleId", articleId);
        return mav;
    }

    @RequestMapping("/{articleId}/remove")
    public  ModelAndView remove(@PathVariable("articleId") String articleId){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_detail_remove");
        mav.addObject("articleId", articleId);
        return mav;
    }

    /**
     * 글 쓰기 화면 보기
     * @return
     */
    @GetMapping("/write")
    public String write(){
        return "bbs/bbs_write";
    }

    /**
     * 실제 글 쓰기
     * @param article
     * @return
     */
    @PostMapping("/write")
    public ModelAndView doWrite(Article article){

        System.out.println(article);

        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_write_do");
        mav.addObject(article);

        return mav;
    }



        //잘 사용하지 않는 방식임!

  /*

    @RequestMapping("/bbs/write/do")
    public String writedo(HttpServletRequest request){
        String articleId = request.getParameter("articleid");
        String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String content = request.getParameter("content");

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(writer);
        System.out.println(content);

        return "bbs_write_do";
    }
    */
}
