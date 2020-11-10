package spring.aoyo_hou.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoOrder {

  private Integer orderId;
  private Integer groupId;
  private String orderCode;
  private Integer commodityId;
  private Integer customId;
  private Integer sendOrderStatus;
  private Integer payChannel;
  private double orderAmount;
  private Integer couponId;
  private double discountAmount;
  private double freightAmount;
  private double orderPracticalAmount;
  private Date orderInputTime;
  private Date orderSettlementTime;
  private Date orderDeliveryTime;
  private Date orderReceivingTime;
  private Integer invoiceState;
  private String orderPayNumber;
  private Integer addressId;
  private String trackingNumber;
  private Integer groupEnjoy;
  private Integer groupOrderReceiving;
  private Integer recordDateId;
  private Integer deleteFlag;

}
