package spring.aoyo_hou.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoGroupAppointmentRules {

  private Integer subscribeId;
  private Integer gruopId;
  private Integer operatorId;
  private Date rulesTime;
  private String subscribeName;
  private Date subscribeStartTime;
  private Date subscribeEndTime;
  private Integer subscribePeopleNum;
  private Date applyStartTime;
  private Date applyEndTime;
  private Date createTime;
  private Integer deleteFlag;



}
