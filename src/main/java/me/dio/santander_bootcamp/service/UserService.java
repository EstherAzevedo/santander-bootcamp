package me.dio.santander_bootcamp.service;

import java.util.NoSuchElementException;
import me.dio.santander_bootcamp.domain.model.User;
import me.dio.santander_bootcamp.domain.repository.UserRepository;
import me.dio.santander_bootcamp.service.impl.UserServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImpl {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
