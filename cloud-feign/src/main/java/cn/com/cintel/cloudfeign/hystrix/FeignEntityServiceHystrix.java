package cn.com.cintel.cloudfeign.hystrix;

import cn.com.cintel.cloudfeign.service.FeignEntityService;
import cn.com.cintel.pojo.BUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 17:21 2018/8/7
 * @Modified By:
 */
@Component
public class FeignEntityServiceHystrix implements FeignEntityService {

    @Override
    public List<BUser> getUser(BUser bUser) {
        List<BUser> userList = new ArrayList<>();
        return userList;
    }
}
