package io.github.aplaraujo.mappers;

import io.github.aplaraujo.dto.UserRequestDTO;
import io.github.aplaraujo.dto.UserResponseDTO;
import io.github.aplaraujo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    User toEntity(UserRequestDTO dto);
    UserResponseDTO toDTO(User user);
}
