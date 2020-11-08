package spring.aoyo_hou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.AoyoCommodityCommentMapper;
import spring.aoyo_hou.pojo.AoyoCommodityComment;
import spring.aoyo_hou.service.AoyoCommodityCommentService;

import java.util.List;

@Service
public class AoyoCommodityCommentServiceImpl implements AoyoCommodityCommentService {

    @Autowired
    private AoyoCommodityCommentMapper aoyoCommodityCommentMapper;
    @Override
    public List<AoyoCommodityComment> findAll() {
        return aoyoCommodityCommentMapper.findAll();
    }

    @Override
    public int del(Integer commodityCommentId) {
        return aoyoCommodityCommentMapper.del(commodityCommentId);
    }
}
