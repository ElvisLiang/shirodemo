package com.shirodemo.shirodemo;

import com.shirodemo.shirodemo.entity.User;
import com.shirodemo.shirodemo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShirodemoApplicationTests {
	@Resource
	UserMapper userMapper;
	@Test
	public void contextLoads() {
		//User user = userMapper.selectByPrimaryKey(1l);
		/*List<String> list = userMapper.selectByUseridPermissionAll(1);*/
		User user = userMapper.selectByUsername("lisi");
		User user2 = userMapper.selectByPrimaryKey(1l);
		System.out.print(user.getFullName());
	}

}
