package io.github.aplaraujo.controllers;

import io.github.aplaraujo.dto.UserRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    private UserRequestDTO save(@RequestBody UserRequestDTO dto) {
        return dto;
    }
}
