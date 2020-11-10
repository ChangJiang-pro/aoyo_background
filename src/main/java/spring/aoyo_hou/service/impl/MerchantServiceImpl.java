package spring.aoyo_hou.service.impl;

import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.MerchantMapper;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.pojo.AoyoMerchant;
import spring.aoyo_hou.service.MerchantService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {


    @Resource
    private MerchantMapper merchantMapper;

    @Override
    public List<AoyoMerchant> merchantshow() {
        return merchantMapper.merchantshow();
    }

    @Override
    public AoyoMerchant merchantshowhuixian(Integer merchantId) {
        return merchantMapper. merchantshowhuixian( merchantId);
    }

    @Override
    public int merchantUpdata(AoyoMerchant image) {
        int i= merchantMapper.merchantUpdata( image);
        int j= merchantMapper.merchantUpdata1( image);
        if (i==0||j==0){
            throw new RuntimeException();

        }
        return i+j;
    }

    @Override
    public List<AoyoMerchant> merchantzhuye() {
        return merchantMapper.merchantzhuye();
    }

    @Override
    public AoyoMerchant merchantzhuyeById(Integer merchantId) {
        return merchantMapper.merchantzhuyeById( merchantId);
    }

    @Override
    public int UpdataMerchantzhuyeById(AoyoMerchant merch) {
        return merchantMapper.UpdataMerchantzhuyeById( merch);
    }

    @Override
    public List<AoyoMerchant> merchantFuWu() {
        return merchantMapper.merchantFuWu();
    }

    @Override
    public AoyoGroupFeaturedServices merchantFuWuById(Integer featuredServicesId) {
        return merchantMapper.merchantFuWuById( featuredServicesId);
    }

    @Override
    public int merchantFuWuXiuGaiById(AoyoGroupFeaturedServices feature) {
        return merchantMapper.merchantFuWuXiuGaiById( feature);
    }

    @Override
    public List<AoyoGroupFeaturedServices> merchantTaoCan() {
        return merchantMapper.merchantTaoCan();
    }

    @Override
    public int merchantTaoCanbyId(AoyoGroupFeaturedServices featuredServices) {
           return merchantMapper.merchantTaoCanbyId(featuredServices);
    }


}
