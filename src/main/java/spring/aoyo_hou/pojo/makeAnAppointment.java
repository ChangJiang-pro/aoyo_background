package spring.aoyo_hou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class makeAnAppointment {
    private Integer customAppointmentId;
    private Integer groupId;
    private Integer appointmentTypeId;
    private Integer appointmentRulesId;
    private Integer userId;
    private Integer customId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date appointmentOverbookingTime;
    private String customName;
    private String customTel;
    private Integer customAppointmentStatusId;
    private String remarks;
    private Integer customAppointmentOperationId;
    private Integer whetherId;
    private Integer deleteFlag;

    private String appointmentTypeName;


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


    private Integer groupParentId;
    private Integer groupType;
    private Integer groupLevel;
    private Integer groupCreatorGroupId;
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
