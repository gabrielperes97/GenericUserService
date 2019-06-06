package com.gabrielperes.userauthserver.service.user;


import com.gabrielperes.userauthserver.service.user.request.CreateUserRequest;
import com.gabrielperes.userauthserver.service.user.response.CreateUserResponse;

public interface UserService {

    CreateUserResponse createUser(CreateUserRequest request);

}
