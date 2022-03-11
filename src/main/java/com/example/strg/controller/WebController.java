package com.example.strg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    //관리자 보관함 메인
    @GetMapping("/a")
    public String adminStrgMain(){
        return "";
    }

    //관리자 보관함 보관소 등록 / 수정
    @GetMapping("/a")
    public String adminstrg1(){
        return "";
    }
    //관리자 보관소 삭제
    @GetMapping("/a")
    public String adminstrg2(){
        return "";
    }
    //보관소 관리자 관리 / 수정
    @GetMapping("/a")
    public String adminstrg3(){
        return "";
    }
    //보관소 관리자 등록
    @GetMapping("/a")
    public String adminstrg4(){
        return "";
    }
    //보관소 관리자 관리 수정
    @GetMapping("/a")
    public String strgAdmin5(){
        return "";
    }
    //보관소 관리자
    @GetMapping("/a")
    public String strgAdmin6(){
        return "";
    }
    //보관소 메인 페이지
    @GetMapping("/a")
    public String adminstrg7(){
        return "";
    }
    //보관소 페이지
    @GetMapping("/a")
    public String adminstrg8(){
        return "";
    }
    //보관소 키오스크
    @GetMapping("/a")
    public String adminstrg9(){
        return "";
    }

}
