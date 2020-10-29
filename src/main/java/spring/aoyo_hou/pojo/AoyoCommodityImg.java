package spring.aoyo_hou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCommodityImg {

  private long commodityImgId;
  private long commodityId;
  private String commodityImgDesc;
  private String commodityImgUrl;
  private long commodityImgIndex;
  private long commodityImgSort;
  private long commodityImgStatus;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date commodityImgLastupdateTime;
  private long deleteFlag;


}
