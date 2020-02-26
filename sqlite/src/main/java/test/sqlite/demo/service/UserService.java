package test.sqlite.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import test.sqlite.demo.entity.User;

import java.util.List;

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

    /**
     * 验证是否存在用户名
     * @param name 用户名
     * @return 存在： true
     */
    Boolean isExist(String name);

    /**
     * 查询所有用户
     * @return 用户集合
     */
    List<User> findAll();

    /**
     * 注册
     * @param user 用户
     * @return 1：true
     */
    Integer register(User user);
}
