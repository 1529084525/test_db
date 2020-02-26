package test.sqlite.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import test.sqlite.demo.dao.UserDao;
import test.sqlite.demo.entity.User;
import test.sqlite.demo.service.UserService;

import java.util.List;

/**
 * @Author ZhiXiang
 * @create 2020/2/26 11:41
 */
@SuppressWarnings("ALL")
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Boolean isTrue(User user) {
        return !StringUtils.isEmpty(userDao.selectOne(new QueryWrapper<User>()
                .eq("name", user.getName())
                .eq("pwd", user.getPwd())));
    }

    @Override
    public Boolean isExist(String name) {
        return !StringUtils.isEmpty(userDao.selectOne(new QueryWrapper<User>().eq("name", name)));
    }

    @Override
    public List<User> findAll() {
        return userDao.selectList(null);
    }

    @Override
    public Integer register(User user) {
        return userDao.insert(user);
    }
}
