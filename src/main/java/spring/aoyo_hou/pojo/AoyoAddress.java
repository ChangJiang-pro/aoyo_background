package spring.aoyo_hou.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoAddress {

  private Integer addressId;
  private Integer customId;
  private String consigneeName;
  private Integer addressLabelId;
  private String telephone;
  private Integer provinceId;
  private Integer cityId;
  private Integer countyId;
  private Integer streetId;
  private String addressDetails;
  private String postcode;
  private Integer addressStatus;
  private Integer defaultAddress;
  private Date creatTime;
  private Integer deleteFlag;


}
