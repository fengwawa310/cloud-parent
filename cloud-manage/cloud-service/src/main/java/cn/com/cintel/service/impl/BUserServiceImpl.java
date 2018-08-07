package cn.com.cintel.service.impl;

import cn.com.cintel.mapper.BUserMapper;
import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import cn.com.cintel.service.BUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 15:27 2018/8/7
 * @Modified By:
 */
@Service
@Transactional
public class BUserServiceImpl implements BUserService {

    @Resource
    BUserMapper bUserMapper;

    @Override
    public String selectByPrimaryKey(String id) {
        BUser bUser = bUserMapper.selectByPrimaryKey(id);
        if (bUser != null){
            return bUser.getUserName();
        }
        return "查无此人！";
    }

    @Override
    public List<BUser> selectByExample(BUser bUser) {
        BUserExample bUserExample = new BUserExample();
        bUserExample.createCriteria().andIdEqualTo(bUser.getId());
        return bUserMapper.selectByExample(bUserExample);
    }
}
