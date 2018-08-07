package cn.com.cintel.service;

import cn.com.cintel.pojo.BUser;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 15:26 2018/8/7
 * @Modified By:
 */
public interface BUserService {

    BUser selectByPrimaryKey(String id);

}
