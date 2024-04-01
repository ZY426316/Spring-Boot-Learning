package top.zyz.boot.mp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zyz.boot.mp.entity.UserDO;
import top.zyz.boot.mp.mapper.UserMapper;


@SpringBootTest
public class UserServiceDeleteTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void update() {
        //方式一: 根据id更新
        mapper.updateById(new UserDO().setId(1).setPhone("13800001111"));
        //实际执行sql: UPDATE user SET phone=? WHERE id=? AND deleted=0
    }

    @Test
    public void select() {
        //1、根据主键获取
        UserDO userDO = mapper.selectById(1);
        //实际执行sql: SELECT id,username,phone,sex,create_time,update_time,deleted FROM user WHERE id=? AND deleted=0
    }
}
