package spring.aoyo_hou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.aoyo_hou.pojo.AoyoCommodityComment;
import spring.aoyo_hou.service.AoyoCommodityCommentService;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class AoyoCommodityCommentController {
    @Autowired
    private AoyoCommodityCommentService aoyoCommodityCommentService;

    @RequestMapping("/findAll")
    public List<AoyoCommodityComment> findAll(){
        List<AoyoCommodityComment> list=aoyoCommodityCommentService.findAll();
        return list;
    }


}
