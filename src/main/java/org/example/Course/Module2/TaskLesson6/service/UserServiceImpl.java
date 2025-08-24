package org.example.Course.Module2.TaskLesson6.service;

import org.example.Course.Module2.TaskLesson6.exception.UserNotFoundException;
import org.example.Course.Module2.TaskLesson6.interfaces.UserService;
import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;
import org.example.Course.Module2.TaskLesson6.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository<ImmutableUser> userRepository = new UserRepository<>();

    @Override
    public void addUser(ImmutableUser user) {
        userRepository.save(user);
    }

    @Override
    public ImmutableUser findUserById(int id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found!"));
    }

    @Override
    public List<ImmutableUser> listAllUsers() {
        return userRepository.findAll();
    }
}