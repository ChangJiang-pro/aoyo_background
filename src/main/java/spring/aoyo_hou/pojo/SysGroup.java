package spring.aoyo_hou.pojo;


import lombok.Data;

@Data
public class SysGroup {

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
  private java.sql.Timestamp groupCreateTime;
  private java.sql.Timestamp groupUpdateTime;
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
  private Integer deleteFlag;
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
