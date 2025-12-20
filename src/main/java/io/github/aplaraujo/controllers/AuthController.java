package io.github.aplaraujo.controllers;

import io.github.aplaraujo.dto.AuthDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String auth(@RequestBody AuthDTO dto) {
        var userAuthToken = new UsernamePasswordAuthenticationToken(dto.login(), dto.password());
        authenticationManager.authenticate(userAuthToken);
        return "Token...";
    }

}
