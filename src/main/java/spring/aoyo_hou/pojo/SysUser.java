package spring.aoyo_hou.pojo;

import lombok.Data;

@Data
public class SysUser {

  private Integer userId;
  private Integer groupId;
  private Integer roleId;
  private String userName;
  private String userPwd;
  private String userAlias;
  private String userTel;
  private String userWeixin;
  private String userQq;
  private String userEmail;
  private String userIdentity;
  private Integer userAddressId;
  private String userImagePath;
  private Integer countyId;
  private String userMac;
  private String userImei;
  private String userToken;
  private Integer loginFlag;
  private String loginDesc;
  private java.sql.Timestamp userLastLogin;
  private String loginUser;
  private Integer userSource;
  private String userCreator;
  private java.sql.Timestamp userCreateTime;
  private java.sql.Timestamp userUpdateTime;
  private String userWxOpenid;
  private String userWxUnionid;
  private Integer workStart;
  private Integer workEnd;
  private Integer childrenAccountId;
  private Integer userStatus;
  private Integer userFlag;
  private Integer userSex;
  private String userWeixinName;


}
