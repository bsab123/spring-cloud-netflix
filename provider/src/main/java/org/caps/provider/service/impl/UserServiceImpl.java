package org.caps.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.caps.provider.domain.User;
import org.caps.provider.mapper.UserMapper;
import org.caps.provider.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
