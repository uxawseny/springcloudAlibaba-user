package alexft.user.service;

import alexft.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IUserService extends IService<User> {

    User getUserByName(User user);
}
