package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
}
