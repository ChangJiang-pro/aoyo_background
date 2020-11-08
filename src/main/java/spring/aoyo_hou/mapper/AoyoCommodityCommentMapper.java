package spring.aoyo_hou.mapper;

import org.springframework.stereotype.Repository;
import spring.aoyo_hou.pojo.AoyoCommodityComment;

import java.util.List;

@Repository
public interface AoyoCommodityCommentMapper {

    List<AoyoCommodityComment> findAll();

    int del(Integer commodityCommentId);
}
