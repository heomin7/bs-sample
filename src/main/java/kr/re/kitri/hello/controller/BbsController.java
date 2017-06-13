package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * /bbs ..전체보기
 * /bbs/15 .. 상세보기(15번 글)
 * /bbs/15/modify ..수정(15번 글 수정)
 * /bbs/15/remove .. 삭제(15번 글 삭제)
 *
 * /bbs/write .. 글 작성화면 로딩
 * /bbs/write/do .. 글 작성하기
 *
 */
@Controller
public class BbsController {

    @RequestMapping("/bbs")
    public ModelAndView viewAll(){

        //전체 보기를 하기위한 데이터를 가져온다.
        MockArticle mock = new MockArticle();
        List<Article> list = mock.getArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list", list);
    }

    @RequestMapping("/bbs/{articleId}")
    public ModelAndView bbsdetail(@PathVariable("articleId") String articleId){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_detail");
        mav.addObject("articleId", articleId);
        return mav;
    }

    @RequestMapping("/bbs/{articleId}/modify")
    public ModelAndView modify(@PathVariable("articleId") String articleId){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_detail_modify");
        mav.addObject("articleId", articleId);
        return mav;
    }

    @RequestMapping("/bbs/15/remove")
    public  String remove(){
        return "bbs/bbs_15_remove";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.GET)
    public String write(){
        return "bbs/bbs_write";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView doWrite(Article article){

        System.out.println(article);

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
