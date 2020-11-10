package spring.aoyo_hou.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCommodityBrand {

  private Integer commodityBrandId;
  private String commodityBrandName;
  private String telephone;
  private String commodityBrandUrl;
  private String commodityBrandDesc;
  private Integer commodityBrandStatus;
  private Integer sort;
  private Integer customId;
  private String endUpdateOperator;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date endUpdateTime;
  private Integer deleteFlag;
}
