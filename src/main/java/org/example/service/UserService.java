package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.getAllUsers();
    }
}
