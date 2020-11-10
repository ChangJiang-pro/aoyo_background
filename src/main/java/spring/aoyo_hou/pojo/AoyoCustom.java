package spring.aoyo_hou.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoCustom {

  private Integer customId;
  private String nickname;
  private String name;
  private String photo;
  private String mobile;
  private String wxPubOpenid;
  private String wxUnionid;
  private Date createTime;
  private Date updateTime;
  private String deleteDesc;
  private Integer statusId;
  private Integer deleteFlag;
  private String wxAppletOpenid;
  private Integer customOriginId;


}
