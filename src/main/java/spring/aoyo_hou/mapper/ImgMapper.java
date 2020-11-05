package spring.aoyo_hou.mapper;


import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;

import java.util.List;

public interface ImgMapper {

    /*轮播图全查*/
    List<AoyoCommodityImg> slideshow();

    /*删除*/
    int shanchu(Integer id);

    /*回显*/
    AoyoCommodityImg huixian(Integer commodityImgId);

    /*轮播图修改*/
    int Updataimage(AoyoCommodityImg image);


    /*
     * 功能按钮
     * */

    /*前台功能按钮全查*/
    List<AoyoGroupFeaturedServices> slideshowtype();

    /*前台功能按钮回显*/
    AoyoGroupFeaturedServices huixiantype(Integer featuredServicesId);

    /*功能按钮修改*/
    int Updataimagetype(AoyoGroupFeaturedServices type11);
}
