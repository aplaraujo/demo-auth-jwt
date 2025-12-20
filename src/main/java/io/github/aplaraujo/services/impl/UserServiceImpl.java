package io.github.aplaraujo.services.impl;

import io.github.aplaraujo.dto.UserRequestDTO;
import io.github.aplaraujo.dto.UserResponseDTO;
import io.github.aplaraujo.entities.User;
import io.github.aplaraujo.mappers.UserMapper;
import io.github.aplaraujo.repositories.UserRepository;
import io.github.aplaraujo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDTO save(UserRequestDTO dto) {
        User doesTheUserExist = userRepository.findByNameAndLogin(dto.name(), dto.login());
        if (doesTheUserExist != null) {
            throw new RuntimeException("This user already exists!");
        }
        var passwordHash = passwordEncoder.encode(dto.password());
        User user = userMapper.toEntity(dto);
        user.setPassword(passwordHash);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }
}