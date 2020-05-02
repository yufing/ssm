package cn.zyf.ssm.service;

import java.util.List;

import cn.zyf.ssm.pojo.User;

public interface UserService {

	int insert(User user);

	int updateByPrimaryKey(User user);

	int deleteByPrimaryKey(Integer id);

	User selectByPrimaryKey(Integer id);

	List<User> selectList();

}
