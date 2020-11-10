package spring.aoyo_hou.pojo;


import lombok.Data;

@Data
public class AoyoAppClassGoods {

  private Integer goodsId;
  private Integer appclassId;
  private String goodsName;
  private String goodsPrice;
  private String goodImg;
  private String goodsNumber;
  private String goodsWeight;
  private String goodsIntroduce;
  private Integer goodsGwcNum;
  private java.sql.Timestamp goodsCreate;
  private java.sql.Timestamp goodsUpdate;
  private Integer goodImgId;
}
