package com.example.pelican.user.controller;

import com.example.pelican.user.dto.UserRequest;
import com.example.pelican.user.dto.UserResponse;
import com.example.pelican.user.service.UserService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public Long createUser(@RequestBody UserRequest.UserCreateRequest req) {
        Long userId = userService.createUser(req);
        return userId;
    }

    @GetMapping("/{userId}")
    public UserResponse.ReadUser getUser(@PathVariable Long userId){
        return userService.readUser(userId);
    }
}
