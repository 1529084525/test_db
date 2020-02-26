package test.sqlite.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import test.sqlite.demo.entity.User;

/**
 * @Author ZhiXiang
 * @create 2020/2/26 11:39
 */
public interface UserService extends IService<User> {
    /**
     * 查询是否登陆成功
     * @param user 用户
     * @return 成功： true
     */
    Boolean isTrue(User user);
}
