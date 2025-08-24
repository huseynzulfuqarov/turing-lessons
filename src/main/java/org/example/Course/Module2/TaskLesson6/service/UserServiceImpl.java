package org.example.Course.Module2.TaskLesson6.service;

import org.example.Course.Module2.TaskLesson6.interfaces.UserService;
import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;
import org.example.Course.Module2.TaskLesson6.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepository();

    @Override
    public void addUser(ImmutableUser user) {
        userRepository.save(user);
    }

    @Override
    public Optional<ImmutableUser> findUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<ImmutableUser> listAllUsers() {
        return userRepository.findAll();
    }
}