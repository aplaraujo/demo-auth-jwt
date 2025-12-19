package io.github.aplaraujo.controllers;

import io.github.aplaraujo.dto.UserRequestDTO;
import io.github.aplaraujo.dto.UserResponseDTO;
import io.github.aplaraujo.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    private UserResponseDTO save(@RequestBody UserRequestDTO dto) {
        return userService.save(dto);
    }

    @GetMapping
    private String teste() {
        return "Oi!!!";
    }
}
