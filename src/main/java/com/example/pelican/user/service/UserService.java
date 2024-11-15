package com.example.pelican.user.service;

import com.example.pelican.user.dto.UserRequest;
import com.example.pelican.user.dto.UserResponse;
import com.example.pelican.user.entity.User;
import com.example.pelican.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Long createUser(UserRequest.UserCreateRequest req){
        User u = new User(null, req.getName(), req.getContext(), req.getInfos());
        userRepository.save(u);
        return u.getId();
    }

    public UserResponse.ReadUser readUser(Long id) {
        Optional<User> u = userRepository.findById(id);
        User user;
        if(u.isPresent()){
            user = u.get();
        } else {
            return null;
        }

        UserResponse.ReadUser ret = UserResponse.ReadUser.from(user);
        return ret;
    }
}
