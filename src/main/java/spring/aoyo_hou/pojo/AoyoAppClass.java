package spring.aoyo_hou.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoAppClass {

  private Integer appClassId;
  private Integer appClassPid;
  private String appClassName;
  private String appClassDesc;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
  private Integer appClassStatus;
  private Integer deleteFlag;
  private Integer appSort;
  private String appClassIcon;



}
