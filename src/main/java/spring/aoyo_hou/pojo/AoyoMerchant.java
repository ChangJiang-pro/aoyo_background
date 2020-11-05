package spring.aoyo_hou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class AoyoMerchant {

  private Integer merchantId;
  private String merchantCode;
  private String merchantName;
  private Integer merchantType;
  private String merchantAddress;
  private String merchantTel;
  private String merchantContacts;
  private String merchantCorporateBank;
  private String merchantCorporateBankNumber;
  private Integer merchantStatus;
  private String merchantLegalPersonImgJust;
  private String merchantLegalPersonImgBack;
  private Integer deleteFlag;
  private String merchantImg;
  private String merchantDescribe;



  private Integer groupId;
  private Integer groupParentId;
  private Integer groupType;
  private Integer groupLevel;
  private Integer groupCreatorGroupId;
  private Integer countyId;
  private Integer groupStatus;
  private String groupName;
  private String groupDesc;
  private String groupCreator;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private String groupCreateTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private String groupUpdateTime;
  private String groupTel;
  private String groupLeader;
  private String groupLeaderTel;
  private String groupAddress;
  private String groupIntegeritude;
  private String groupLatitude;
  private String groupCodeImage;
  private Integer groupCode;
  private String groupBank;
  private String groupBankAccount;
  private String groupLeaderAccount;
  private String groupIcon;
  private Integer groupSaleId;
  private String groupImg;
  private Integer cardId;
  private Integer loginFlag;
  private Integer showFlag;
  private Integer etcFlag;
  private String groupEncode;
  private String groupAlias;
  private Integer parentPayStatus;
  private java.sql.Timestamp deleteTime;
  private String deleteDesc;
  private Integer deleteUserId;
  private String deleteUserName;
  private String groupRoadName;
  private String groupCodeNum;
  private String groupLegalPersonImgJust;
  private String groupLegalPersonImgBack;
  private String certificatesImgurlOne;
  private String certificatesImgurlTwo;
  private Integer certificatesStatus;
  private double groupIncomeRatio;
  private Integer groupAddressId;

}
