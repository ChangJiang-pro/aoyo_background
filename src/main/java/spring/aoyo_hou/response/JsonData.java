package spring.aoyo_hou.response;

import lombok.Data;

@Data
public class JsonData {
    private Integer code;
    private String  msg;
    private Object data;

    public JsonData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
