package org.caps.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.caps.provider.domain.User;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> getAllUserInfo();
}