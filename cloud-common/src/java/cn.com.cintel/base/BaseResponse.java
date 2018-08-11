package cn.com.cintel.base;

import java.io.Serializable;

/**
 * 自定义response
 *
 * @author cuidianlong
 * 2017-04-28
 */
public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code; //状态码
    private String time; //时间
    private Object desc; //描述
    private Object data; //数据
    private Integer totalRecord;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getDesc() {
        return desc;
    }

    public void setDesc(Object desc) {
        this.desc = desc;
    }


    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code='" + code + '\'' +
                ", time='" + time + '\'' +
                ", desc=" + desc +
                ", data=" + data +
                '}';
    }
}
