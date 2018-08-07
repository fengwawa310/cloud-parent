package cn.com.cintel.service;

import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;

import java.util.List;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 15:26 2018/8/7
 * @Modified By:
 */
public interface BUserService {

    String selectByPrimaryKey(String id);

    List<BUser> selectByExample(BUser bUser);

}
