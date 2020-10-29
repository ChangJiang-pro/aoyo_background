package spring.aoyo_hou.service.impl;

import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.ImgMapper;
import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.service.ImgService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class  ImgServiceImpl implements ImgService {

    @Resource
    private ImgMapper imgMapper;

    @Override
    public List<AoyoCommodityImg> slideshow() {
        return imgMapper.slideshow();
    }
}
