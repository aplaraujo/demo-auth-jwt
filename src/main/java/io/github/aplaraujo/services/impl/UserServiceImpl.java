package io.github.aplaraujo.services.impl;

import io.github.aplaraujo.dto.UserRequestDTO;
import io.github.aplaraujo.dto.UserResponseDTO;
import io.github.aplaraujo.entities.User;
import io.github.aplaraujo.mappers.UserMapper;
import io.github.aplaraujo.repositories.UserRepository;
import io.github.aplaraujo.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO save(UserRequestDTO dto) {
        User user = userMapper.toEntity(dto);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }
}