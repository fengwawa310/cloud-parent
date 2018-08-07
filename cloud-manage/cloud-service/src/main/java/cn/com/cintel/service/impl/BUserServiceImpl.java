package cn.com.cintel.service.impl;

import cn.com.cintel.mapper.BUserMapper;
import cn.com.cintel.pojo.BUser;
import cn.com.cintel.service.BUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

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
    public BUser selectByPrimaryKey(String id) {
        return bUserMapper.selectByPrimaryKey(id);
    }
}
