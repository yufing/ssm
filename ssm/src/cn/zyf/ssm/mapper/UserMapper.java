package cn.zyf.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import cn.zyf.ssm.pojo.User;

//@Repository//接口，应该由myBatis的SQLSession创建
public interface UserMapper {
	
	@Insert("insert into t_user (name,password,age) values (#{name},#{password},#{age})")
	int insert(User user);
	
	@Update("update t_user set name=#{name},password=#{password},age=#{age} where id=#{id}")
	int updateByPrimaryKey(User user);
	
	@Delete("delete from t_user where id = #{id}")
	int deleteByPrimaryKey(Integer id);
	
	@Select("select * from t_user where id = #{id}")
	User selectByPrimaryKey(Integer id);
	
	@Select("select * from t_user")
	List<User> selectList();
	
}
