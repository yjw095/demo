package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/5/25.
 */
@Service
public class CommentService {

    @Reference(version="test1.0.0")
    com.fdc.home.workstation.service.inter.CommentService commentService;
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CommentService.class);


    public int getCount() {
        log.info("come in service getCount");
        com.fdc.home.workstation.domain.Comment comm = new com.fdc.home.workstation.domain.Comment();
        return commentService.getCount(comm);
    }


}
