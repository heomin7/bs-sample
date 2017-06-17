package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * /post .. 글 전체보기
 * /post/{postSeq} ..글 상세 보기
 * /post/write (GET) ..글 쓰기 화면
 * /post/write (POST) ..글 쓰기
 * /post/signup (GET) .. 회원가입 화면
 * /post/signup (POST) .. 회원가입
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("")
    public ModelAndView post(){

        List<Post> list = postService.viewPosts();
        System.out.println(list);
        return new ModelAndView(
                "post/post_all")
                .addObject("list" ,list);
    }

    @RequestMapping("/{postSeq}")
    public ModelAndView postDetail(@PathVariable("postSeq") String postSeq){

        Post post = postService.viewPost(Integer.parseInt(postSeq));
        return new ModelAndView("post/post_detail")
                .addObject("post", post);
    }

    @GetMapping("/write")
    public String write(){
        return "post/write";
    }


    @PostMapping("/write")
    public ModelAndView doWrite(Post post){
        postService.registPost(post);

        return new ModelAndView("post/do_write")
                .addObject("post", post);
    }

    @GetMapping("/signup")
    public String signup(){
        return "post/post_signup";
    }

    @PostMapping("/signup")
    public ModelAndView doSignup(
            @RequestParam String userId,
            @RequestParam String password,
            @RequestParam String email
    ){
        Member member = new Member();
        member.setUserId(userId);
        member.setPassword(password);
        member.setEmail(email);
        postService.registMember(member);
        return new ModelAndView("post/post_do_signup")
                .addObject("member", member);
    }

}
