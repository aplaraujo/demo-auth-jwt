package io.github.aplaraujo.services;

import io.github.aplaraujo.dto.UserRequestDTO;
import io.github.aplaraujo.dto.UserResponseDTO;

public interface UserService {
    public UserResponseDTO save(UserRequestDTO dto);
}
