package spring.aoyo_hou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCommodityImg {

  private Integer commodityImgId;
  private Integer commodityId;
  private String commodityImgDesc;
  private String commodityImgUrl;
  private Integer commodityImgIndex;
  private Integer commodityImgSort;
  private Integer commodityImgStatus;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private String commodityImgLastupdateTime;
  private long deleteFlag;


}
