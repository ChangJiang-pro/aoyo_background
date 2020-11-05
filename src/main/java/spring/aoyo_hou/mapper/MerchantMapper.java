package spring.aoyo_hou.mapper;


import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.pojo.AoyoMerchant;

import java.util.List;

public interface MerchantMapper {

    /*商户列表全查*/
    List<AoyoMerchant> merchantshow();

    /*商户回显*/
    AoyoMerchant merchantshowhuixian(Integer merchantId);

    /*商户修改*/
    int merchantUpdata(AoyoMerchant image);

    int merchantUpdata1(AoyoMerchant image);


    /*商户主页信息*/
    List<AoyoMerchant> merchantzhuye();

    /*商户主页信息详情*/
    AoyoMerchant merchantzhuyeById(Integer merchantId);

    /*商户主页信息详情修改*/
    int UpdataMerchantzhuyeById(AoyoMerchant merch);

    /*特色服务列表*/
    List<AoyoMerchant> merchantFuWu();

    /*特色服务单查*/
    AoyoGroupFeaturedServices merchantFuWuById(Integer featuredServicesId);

    /*特色服务修改*/
    int merchantFuWuXiuGaiById(AoyoGroupFeaturedServices feature);
}
