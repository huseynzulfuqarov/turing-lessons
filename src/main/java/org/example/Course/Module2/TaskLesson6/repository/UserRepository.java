package org.example.Course.Module2.TaskLesson6.repository;

import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final List<ImmutableUser> users = new ArrayList<>();

    public void save(ImmutableUser user) {
        users.add(user);
    }

    public Optional<ImmutableUser> findById(int id) {
        for (ImmutableUser user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public List<ImmutableUser> findAll() {
        return new ArrayList<>(users);
    }
}