package cn.com.cintel.controller;

import cn.com.cintel.base.BaseResponse;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

public class BaseController {

    /**
     * 成功结果集
     *
     * @param data 数据
     * @param desc 描述
     * @param code 状态码
     * @return
     */
    public BaseResponse ajaxSucc(Object data, String desc, String code) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setTime(new Date().getTime() + "");
        baseResponse.setData(data);
        return baseResponse;
    }


    /**
     * 失败结果集
     *
     * @param desc 描述
     * @param code 状态码
     * @return
     */
    public BaseResponse ajaxFail(Object desc, String code) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setData("{}");
        baseResponse.setTime(new Date().getTime() + "");
        return baseResponse;
    }

}
