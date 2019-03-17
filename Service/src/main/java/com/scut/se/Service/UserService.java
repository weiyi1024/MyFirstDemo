package com.scut.se.Service;

import com.scut.se.Dao.dao.UserMapper;
import com.scut.se.Dao.entity.User;
import com.scut.se.Dao.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String name){
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> result = userMapper.selectByExample(example);
        return (CollectionUtils.isEmpty(result) ? null : result.get(0));
    }

}
