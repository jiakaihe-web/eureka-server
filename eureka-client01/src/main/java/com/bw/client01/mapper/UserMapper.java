package com.bw.client01.mapper;

import com.bw.client01.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


    List<User> selectAll();

    void addUser(User user);

    void delUser(Integer id);


}
