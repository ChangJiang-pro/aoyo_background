package spring.aoyo_hou.service;


import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;

import java.util.List;

public interface ImgService {


    /*
    * 轮播图
    * */

    List<AoyoCommodityImg> slideshow();

    int shanchu(Integer id);

    AoyoCommodityImg huixian(Integer commodityImgId);

    int Updataimage(AoyoCommodityImg image);


    /*
     * 功能按钮
     * */

    List<AoyoGroupFeaturedServices> slideshowtype();

    AoyoGroupFeaturedServices huixiantype(Integer featuredServicesId);

    int Updataimagetype(AoyoGroupFeaturedServices type11);
}
