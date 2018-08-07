package cn.com.cintel.mapper;

import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BUserMapper {
    long countByExample(BUserExample example);

    int deleteByExample(BUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BUser record);

    int insertSelective(BUser record);

    List<BUser> selectByExample(BUserExample example);

    BUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByExample(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByPrimaryKeySelective(BUser record);

    int updateByPrimaryKey(BUser record);
}