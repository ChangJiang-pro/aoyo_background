package spring.aoyo_hou.service;

import spring.aoyo_hou.pojo.AoyoCommodityComment;

import java.util.List;

public interface AoyoCommodityCommentService {
    List<AoyoCommodityComment> findAll();

    int del(Integer commodityCommentId);
}
