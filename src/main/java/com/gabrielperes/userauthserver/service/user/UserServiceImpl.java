package com.gabrielperes.userauthserver.service.user;

import com.gabrielperes.userauthserver.model.User;
import com.gabrielperes.userauthserver.repository.UserRepository;
import com.gabrielperes.userauthserver.service.user.request.CreateUserRequest;
import com.gabrielperes.userauthserver.service.user.response.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        User user = new User();
        user.setRecoveryEmail(request.getEmail());
        user.setUsername(request.getUsername());

        CreateUserResponse createUserResponse = new CreateUserResponse(user.getUsername(), user.getRecoveryEmail());
        return createUserResponse;
    }
}
