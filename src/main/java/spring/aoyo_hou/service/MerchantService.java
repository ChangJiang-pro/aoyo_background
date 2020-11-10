package spring.aoyo_hou.service;


import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.pojo.AoyoMerchant;

import java.util.List;

public interface MerchantService {


    List<AoyoMerchant> merchantshow();

    AoyoMerchant merchantshowhuixian(Integer merchantId);

    int merchantUpdata(AoyoMerchant image);

    List<AoyoMerchant> merchantzhuye();

    AoyoMerchant merchantzhuyeById(Integer merchantId);

    int UpdataMerchantzhuyeById(AoyoMerchant merch);

    List<AoyoMerchant> merchantFuWu();

    AoyoGroupFeaturedServices merchantFuWuById(Integer featuredServicesId);

    int merchantFuWuXiuGaiById(AoyoGroupFeaturedServices feature);

    List<AoyoGroupFeaturedServices> merchantTaoCan();

    int merchantTaoCanbyId(AoyoGroupFeaturedServices featuredServices);
}
