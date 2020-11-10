package spring.aoyo_hou.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoGroupFeaturedServices {

  private Integer featuredServicesId;
  private String functionButtonName;
  private String featuredServicesDesc;
  private String featuredServicesRemarks;
  private Integer featuredServicesIsenable;
  private Integer deleteFlag;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
  private String functionButtonUrl;
  private String jumpPath;
  private String packageType;



 

}
