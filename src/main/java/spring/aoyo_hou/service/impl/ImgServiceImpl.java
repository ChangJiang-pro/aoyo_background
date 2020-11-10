package spring.aoyo_hou.service.impl;

import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.ImgMapper;
import spring.aoyo_hou.pojo.*;
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

    @Override
    public int shanchu(Integer id) {
        return imgMapper.shanchu(id);
    }

    @Override
    public AoyoCommodityImg huixian(Integer commodityImgId) {
        return imgMapper.huixian(commodityImgId);
    }

    @Override
    public int Updataimage(AoyoCommodityImg image) {
        return imgMapper.Updataimage(image);
    }





    /*
     * 功能按钮
     * */

    @Override
    public List<AoyoGroupFeaturedServices> slideshowtype() {
        return imgMapper.slideshowtype();
    }

    @Override
    public AoyoGroupFeaturedServices huixiantype(Integer featuredServicesId) {
        return imgMapper.huixiantype(featuredServicesId);
    }

    @Override
    public int Updataimagetype(AoyoGroupFeaturedServices type11) {
        return imgMapper.Updataimagetype(type11);
    }





    /*
    *
    * app分类列表
    *
    * */



    @Override
    public List<AoyoAppClass> appFenLei() {
        return imgMapper.appFenLei();
    }

    @Override
    public int appFenLeibyId(AoyoAppClass appClass) {
        return imgMapper.appFenLeibyId(appClass);
    }

    @Override
    public List<AoyoCommodityBrand> appBrand() {
        return imgMapper.appBrand();
    }

    @Override
    public int appBrandbyId(AoyoCommodityBrand commodityBrand) {
        return imgMapper.appBrandbyId(commodityBrand);
    }

    @Override
    public List<AoyoAppClass> appcommodity() {
        return imgMapper.appcommodity();
    }

    @Override
    public int UpdataAppCommodity(AoyoAppClass appClass) {
         return imgMapper.UpdataAppCommodity(appClass);
    }
}
