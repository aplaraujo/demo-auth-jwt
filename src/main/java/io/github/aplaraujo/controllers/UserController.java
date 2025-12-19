package io.github.aplaraujo.controllers;

import io.github.aplaraujo.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    private UserDTO save(@RequestBody UserDTO dto) {
        return dto;
    }
}
