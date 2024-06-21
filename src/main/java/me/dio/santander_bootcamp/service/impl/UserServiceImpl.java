package me.dio.santander_bootcamp.service.impl;

import me.dio.santander_bootcamp.domain.model.User;

public interface UserServiceImpl {

    User findById(Long id);
    User create(User userToCreate);
}
