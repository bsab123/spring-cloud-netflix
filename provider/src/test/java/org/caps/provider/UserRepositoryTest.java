package org.caps.provider;

import org.caps.provider.domain.User;
import org.caps.provider.mapper.UserMapper;

import org.caps.provider.repository.UserRepository;
import org.caps.provider.vo.SearchUserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;


    @Test
    public void saveUserInfo(){
        System.out.println("saveUserInfo Start:");
        System.out.println("-------------------------------");
        List<User> users = userMapper.getAllUserInfo();
        List<SearchUserInfo> searchUserInfoList =new ArrayList<>();
        users.forEach(user -> {
            SearchUserInfo searchUserInfo=new SearchUserInfo();
            BeanUtils.copyProperties(user,searchUserInfo);
            searchUserInfoList.add(searchUserInfo);
            userRepository.save(searchUserInfo);
        });
    }

    @Test
    public void fetchAllCustomers() {
        System.out.println("user found with findAll():");
        System.out.println("-------------------------------");
        Iterable<SearchUserInfo> iterable = userRepository.findAll();
        iterable.forEach(user->{
            System.out.println(user.toString());
        });
    }

    @Test
    public void fetchIndividualCustomers() {
        String name="1";
        List<SearchUserInfo> userInfos = userRepository.findByNameIsLike(name);
        for (SearchUserInfo userInfo : userInfos) {
            System.out.println(userInfo.toString());
        }
    }
}
