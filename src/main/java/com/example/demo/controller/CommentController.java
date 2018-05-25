package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/5/25.
 */
@Controller
public class CommentController {

    @Reference(version="test1.0.0")
    com.fdc.home.workstation.service.inter.CommentService commentService;
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CommentController.class);


    @RequestMapping("/home4")
    public ModelAndView home3(){
        com.fdc.home.workstation.domain.Comment comm = new com.fdc.home.workstation.domain.Comment();
        Integer a = commentService.getCount(comm);
        log.info(" a:{} " ,a);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user",a );
        return modelAndView;
    }


}
