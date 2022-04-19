package alexft.user.service.impl;

import alexft.user.entity.User;
import alexft.user.mapper.UserMapper;
import alexft.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserByName(User user) {
        return userMapper.selectUser(user);
    }
}
