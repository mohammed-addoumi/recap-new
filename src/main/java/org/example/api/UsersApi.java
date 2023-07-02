package org.example.api;

import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.services.UserService;
import org.example.utils.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersApi {

    private final UserService userService;

    @GetMapping
    public ApiResponse<List<User>> getAllUsers(){
        return ApiResponse.ok(userService.getAllUsers());
    }
}
