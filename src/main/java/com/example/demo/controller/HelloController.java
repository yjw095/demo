package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dao.CommentMapper;
import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2018/5/23.
 */
@Controller
public class HelloController {


    @Resource
    CommentMapper commentMapper;
    @Resource
    CommentService commentService;

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(HelloController.class);


    @RequestMapping(value ="/home", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "你好，world";
    }


    @RequestMapping("/home2")
    public ModelAndView userList(){
        List<Comment> list = commentMapper.getlist();
        log.info("list:{}" ,list.size());
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user",list.size() );
        return modelAndView;
    }


    @RequestMapping("/home3")
    public ModelAndView home3(){
        Integer a = commentService.getCount();
        log.info(" a:{} " ,a);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user",a );
        return modelAndView;
    }


}
