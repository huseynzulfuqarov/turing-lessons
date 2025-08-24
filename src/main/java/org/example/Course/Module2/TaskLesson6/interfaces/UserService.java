package org.example.Course.Module2.TaskLesson6.interfaces;

import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(ImmutableUser user);

    Optional<ImmutableUser> findUserById(int id);

    List<ImmutableUser> listAllUsers();
}