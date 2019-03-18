package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    //推荐使用#{}取值，不要用${},因为存在注入的风险
    @Insert("INSERT INTO user(name,phone,create_time,age) VALUES(#{name}, #{phone}, #{createTime},#{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(User user);





    @Select("SELECT * FROM user")
    @Results({
        @Result(column = "create_time",property = "createTime")  //javaType = java.util.Date.class
    })
    List<User> getAll();



    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
    	 @Result(column = "create_time",property = "createTime")
    })
    User findById(Long id);



    @Update("UPDATE user SET name=#{name} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{userId}")
    void delete(Long userId);
//
}
