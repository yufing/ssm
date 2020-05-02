package cn.zyf.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zyf.ssm.mapper.UserMapper;
import cn.zyf.ssm.pojo.User;
import cn.zyf.ssm.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	/*
	 * 问题：UserMapper映射接口的代理对象如何创建？
	 * ----------------------
	 * 使用Spring之前
	 * 1，读取mybatis-confg.xml创建SqlSessionFacotry MyBatis的工厂对象
	 * 
	 * 2，使用工厂创建创建 SqlSession 会话对象
	 * 	 SqlSession sqlsession = factory.openSession();
	 * 3，使用SqlSession创建映射接口的代理对象
	 *    UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
	 * --------------------------------------------------------------------
	 * 
	 *  使用Spring创建
	 *  因为MyBatis和Spring框架进行集成，所有相关的集成代码都在mybatis和spring集成的桥梁包中
	 *   mybatis-spring-1.3.1.jar 中
	 *   
	 *  开发者只需要在Spring的配置文件中做好对应配置即可，所有操作最终全部交给Spring
	 *  
	 *  1，配置SqlSessionFacotry对象创建
	 *    桥梁包 ： org.mybatis.spring.SqlSessionFactoryBean 类
	 *    实现了FacotryBean 接口，Spring实例化bean的第四种方式
	 *  2， 配置创建SqlSession会话对象
	 *    如果使用Spring不需要配置，在创建映射接口XxxMapper的时候底层自动先创建一个SqlSesion
	 *    再使用这个创建SqlSession创建代理对象
	 *    
	 *  3，创建UserMapper映射接口的代理对象
	 *    两种方式：
	 *    	1，单个创建映射接口的代理对象-学习了解
	 *    		桥梁包： org.mybatis.spring.mapper.MapperFactoryBean<T>
	 *           实现了FacotryBean 接口，Spring实例化bean的第四种方式
	 *      2，使用包扫描创建mapper包下面所有的映射接口代理对象-推荐	
	 *  		桥梁包：org.mybatis.spring.mapper.MapperScannerConfigurer
	 * 
	 * 
	 */
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public List<User> selectList() {
		return userMapper.selectList();
	}
	
	
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateByPrimaryKey(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	

}
