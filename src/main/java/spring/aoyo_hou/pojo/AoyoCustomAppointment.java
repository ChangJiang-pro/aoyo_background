package spring.aoyo_hou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCustomAppointment {

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
}
