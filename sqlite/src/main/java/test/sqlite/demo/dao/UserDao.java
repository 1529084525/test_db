package test.sqlite.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import test.sqlite.demo.entity.User;

/**
 * @Author ZhiXiang
 * @create 2020/2/25 16:01
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
